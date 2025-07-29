class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        char ans = ' ';

        int[] letter = new int[26];
        

        for(int i=0;i<n;i++){
            int ch = s.charAt(i) - 'a';
            letter[ch]++;
        }

        for(int i=0;i<m;i++){
            int ch = t.charAt(i)-'a';
            System.out.println(ch);
            if(letter[ch]>0){
                letter[ch]--;
                continue;
            } 
            if(letter[ch]==0){
                // ans = (char)ch;
                // break;
                return (char)(ch+'a');
            }
        }
       return ' ';
    }
}