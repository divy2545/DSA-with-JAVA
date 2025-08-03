class Solution {
    public int splitNum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                str1.append(arr[i]);
            }
            else{
                str2.append(arr[i]);
            }
        }

        return Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());

    }
}