class Solution {
    public int splitNum(int num) {
        String str = num + "";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String num1 = "";
        for(int i=0; i<charArray.length; i+=2){
            num1 += charArray[i];
        }
        String num2 = "";
        for(int i=1; i<charArray.length; i+=2){
            num2 += charArray[i];
        }

        return Integer.parseInt(num1) + Integer.parseInt(num2);

    }
}