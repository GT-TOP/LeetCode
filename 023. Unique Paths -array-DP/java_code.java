class Solution {
    public int uniquePaths(int m, int n) {
        // int[] count = new int[1];
        // count[0] = 0;
        // dfs(0,0,m,n,count);
        // return count[0];
        int[][] nums = new int[m][n];
        for (int i = 0; i < n; i++)
            nums[0][i] = 1;
        for (int i = 0; i < m; i++)
            nums[i][0] = 1;
        
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                nums[i][j] = nums[i-1][j] + nums[i][j-1];
            }
        }
        return nums[m-1][n-1];
    }
    
//     public static void dfs(int r, int l, int m, int n, int[] count){
        
//         if (r == m - 1 && l == n - 1){
//             count[0] += 1;
//             return;
//         }
        
//         if (l == n-1)
//             dfs(r+1,l,m,n,count);
//         else if (r == m-1)
//             dfs(r,l+1,m,n,count);
//         else{
//             dfs(r+1,l,m,n,count);
//             dfs(r,l+1,m,n,count);
//         }
//     }
}
