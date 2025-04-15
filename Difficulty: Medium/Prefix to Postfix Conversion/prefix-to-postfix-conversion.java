//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToPost(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        Stack<String> st = new Stack<>();
        for(int i=pre_exp.length()-1; i>=0; i--){
            char ch = pre_exp.charAt(i);
            
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                st.push(String.valueOf(ch));
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String s = t1 + t2 + ch;
                st.push(s);
            }
        }
        
        return st.peek();
    }
}
