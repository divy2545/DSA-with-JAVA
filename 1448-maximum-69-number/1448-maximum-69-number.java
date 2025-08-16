class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();

        boolean flag = true;

        for(char ch: str.toCharArray()){
         if(flag && ch == '6'){
            sb.append('9');
            flag = false;
            continue;
         }   
         sb.append(ch);
        }

        String s = sb.toString();
        int numm = Integer.parseInt(s);

        return numm;
    }
}