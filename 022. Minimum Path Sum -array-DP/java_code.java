class Solution {
    public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] dt = new int[row][col];
		
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				dt[i][j] = grid[i][j];
			}
		}
		
		for (int j = 1; j < col; j++){
			dt[0][j] = dt[0][j-1] + grid[0][j];
		}
		
		for (int i = 1; i < row; i++){
			dt[i][0] = dt[i - 1][0] + grid[i][0];
		}
		
		for (int i = 1; i < row; i++){
			for (int j = 1; j < col; j++){
				dt[i][j] = Math.min(dt[i-1][j], dt[i][j-1]) + grid[i][j];
			}
		}
		
		return dt[row-1][col-1];
		}
}
