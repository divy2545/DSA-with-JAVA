class Solution {
    public void build(int i, int l, int r, int[] baskets, int[] segmentTree){
        if(l==r){
            segmentTree[i] = baskets[l];
            return;
        }

        int mid = l + (r-l)/2;
        build(2*i+1, l, mid, baskets, segmentTree);
        build(2*i+2, mid+1, r, baskets, segmentTree);

        segmentTree[i] = Math.max(segmentTree[2*i+1], segmentTree[2*i+2]);
    }

    public boolean querySegmentTree(int i, int l, int r, int[] segmentTree, int fruit){
        if(segmentTree[i] < fruit) return false;

        if(l == r){
            segmentTree[i] = -1;
            return true;
        }

        int mid = l + (r-l)/2;
        boolean placed = false;

        if(segmentTree[2*i+1] >= fruit){
            placed = querySegmentTree(2*i+1, l, mid, segmentTree, fruit);
        }
        else{
            placed = querySegmentTree(2*i+2, mid+1, r, segmentTree, fruit);
        }

        segmentTree[i] = Math.max(segmentTree[2*i+1], segmentTree[2*i+2]);

        return placed;

    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;

        int[] segmentTree = new int[4*n];
        Arrays.fill(segmentTree, -1);

        build(0, 0, n-1, baskets, segmentTree);

        int unplaced = 0;

        for(int fruit : fruits){
            if(querySegmentTree(0, 0, n-1, segmentTree, fruit) == false) unplaced++;
        }

        return unplaced;

    }
}