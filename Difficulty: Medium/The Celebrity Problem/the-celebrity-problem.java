//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int[] knowMe = new int[n];
        int[] iKnow = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                knowMe[j]++;
                iKnow[i]++;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(knowMe[i]==n && iKnow[i]==1){
                return i;
            }
        }
        
        return -1;
        
    }
}