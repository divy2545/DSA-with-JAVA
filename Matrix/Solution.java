package Matrix;


//============================================================================================
//                           73.  set Matrix Zeroes
//===========================================================================================

//   => brute force approach
// take 2 extra arrays one for row and another for column .. which will be used to store the indices of the elements in the matrix where 0 appears
// traverse the whole matrix and store the indices of the respective element where the zero occurs in its respective row and column array

// time complexity - O(m x n)
// space complexity - O(m + n)


// class Solution {
//     public void setZeroes(int[][] matrix) {
//        int m=matrix.length;
//        int n=matrix[0].length;

//        int[] rows= new int[m];
//        int[] cols= new int[n];

//        for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(matrix[i][j]==0){
//                 rows[i]=1;
//                 cols[j]=1;
//             }
//         }
//        } 

//        for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(rows[i]==1 || cols[j]==1){
//                 matrix[i][j]=0;
//             }
//         }}
//     }
// }



//           =>    optimized approach

// time complexity cannot be reduced in optimized approach but space complexity can be reduced to O(1) if we do not use arrays

// for that use the first row and first coloumn of the matrix as row and column arrays for storing the index of the element of the matrix where zero occurs..

// class Solution {
//     public void setZeroes(int[][] matrix) {
//        int m=matrix.length;
//        int n=matrix[0].length;
         
//        int col0=1;
//        for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(matrix[i][j]==0){
//                 matrix[i][0]=0;
//                 if(j!=0)
//                  matrix[0][j]=0;
//                 else
//                 col0=0;
//             }
//         }
//        } 

//        for(int i=1;i<m;i++){
//         for(int j=1;j<n;j++){
//             if(matrix[i][j]!=0){
//             if(matrix[i][0]==0 || matrix[0][j]==0 ){
//                 matrix[i][j]=0;
//             }}
//         }}
//         if(matrix[0][0]==0){
//             for(int j=0;j<n;j++){
//                 matrix[0][j]=0;
//             }
//         }
//         if(col0==0){
//             for(int i=0;i<m;i++){
//                 matrix[i][0]=0;
//             }
//         }
        

//     }
// }







//==================================================================================================
//                         48. rotate image
//=================================================================================================

// time complexity - O(m*m)
// space complexity- O(m*m)

// class Solution {
//     public void rotate(int[][] matrix) {
//         int m=matrix.length;
        
//         int[][] arr=new int[m][m];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m;j++){
//                 arr[j][m-1-i]=matrix[i][j];
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=arr[i][j];
//             }}
//     }
// }



//------------------------optimized approach--------------------------------------------------------

// time complexity- O(m*m)
// space complexity - O(1)

// class Solution {
//     public void rotate(int[][] matrix) {
//         int m=matrix.length;
//         // transpose the matrix

//         for(int i=0;i<m-1;i++){
//             for(int j=i;j<m;j++){
//                 int temp=matrix[i][j];
//                 matrix[i][j]=matrix[j][i];
//                 matrix[j][i]=temp;
//             }
//         }
//         for(int i=0;i<m;i++){
//             int p1=0,p2=m-1;
//             while(p1<=p2){
//                 int temp=matrix[i][p1];
//                 matrix[i][p1]=matrix[i][p2];
//                 matrix[i][p2]=temp;
//                 p1++;
//                 p2--;
//             }
//         }
//     }
// }





//============================================================================================================
//                              54.   Spiral Matrix
//===========================================================================================================


// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> l1= new ArrayList<>();
//         int m=matrix.length;
//         int n=matrix[0].length;
//         int rowtop=0,colright=n-1;
//         int rowbottom=m-1,colleft=0;
//         while(rowtop<=rowbottom && colleft<=colright){
//         for(int i=colleft;i<=colright;i++){
//              l1.add(matrix[rowtop][i]);
//         }
//         rowtop++;
//         for(int j=rowtop;j<=rowbottom;j++){
//             l1.add(matrix[j][colright]);
//         }
//         colright--;
//         if(rowtop<=rowbottom){
//         for(int i=colright;i>=colleft;i--){
//             l1.add(matrix[rowbottom][i]);
//         }
//         rowbottom--;
//         }
//         if(colleft<=colright){
//         for(int j=rowbottom;j>=rowtop;j--){
//             l1.add(matrix[j][colleft]);
//         }
//         colleft++;
//         }
//         }
//         return l1;
//     }
// }


// time complexity- O(m*n)
// space complexity- O(1)

