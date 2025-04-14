//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('(', 0);
        mp.put('+',1);
        mp.put('-',1);
        mp.put('*',2);
        mp.put('/',2);
        mp.put('^',3);
        
        while(i<s.length()){
            char ch = s.charAt(i);
            
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                sb.append(ch);
            }
            
            else if(ch == '('){
                st.push(ch);
            }
            
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '(' ){
                    sb.append(st.pop());
                }
                st.pop();
            }
            
            else{
                while(!st.isEmpty() && mp.get(ch) <= mp.get(st.peek())){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
            i++;
            
        }
        
         while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        
        return sb.toString();
        
        
    }
}