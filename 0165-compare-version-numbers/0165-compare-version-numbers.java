class Solution {
    public int compareVersion(String version1, String version2) {
        String[] lvl1 = version1.split("\\.");
        String[] lvl2 = version2.split("\\.");

        int len = Math.max(lvl1.length, lvl2.length);

        for(int i=0; i<len; i++){
            Integer v1 = i < lvl1.length ? Integer.parseInt(lvl1[i]) : 0;
            Integer v2 = i < lvl2.length ? Integer.parseInt(lvl2[i]) : 0;
            int cmp = v1.compareTo(v2);
            if(cmp != 0){
                return cmp;
            }
        }

        return 0;
    }
}