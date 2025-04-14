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
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
       Stack<String> st = new Stack<>();
       int i = 0;
       
       while(i<exp.length()){
            char ch = exp.charAt(i);
            
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                st.push(String.valueOf(ch));
            }
            else{ 
                String t1 = st.pop();
                String t2 = st.pop();
                String s = '(' + t2 + ch + t1 + ')';
                st.push(s);
            }
            i++;
       }
       
       return st.peek();
       
    }
}
