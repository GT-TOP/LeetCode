class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxi = 0;
		int sum = 0;
		int r = grid.length;
		int c = grid[0].length;
		for (int i=0; i<r; i++){
			for (int j=0; j<c; j++){
				if (grid[i][j] == 1){
					grid[i][j]= -1;
					sum += itera(i,j,r,c, grid) + 1;
					if (sum > maxi)
						maxi = sum;
					sum = 0;
				}
			}
		}
        return maxi;
    }
    public static int itera(int i, int j, int r, int c, int[][] grid){
		int sum = 0;
		if (i-1 >= 0){
			if (grid[i-1][j] == 1){
				grid[i-1][j] = -1;
				sum += 1;
				sum += itera(i-1,j,r,c,grid);
			}
		}
		if (i+1 < r){
			if (grid[i+1][j] == 1){
				grid[i+1][j] = -1;
				sum += 1;
				sum += itera(i+1,j,r,c,grid);
			}
		}
		if (j+1 < c){
			if (grid[i][j+1] == 1){
				grid[i][j+1] = -1;
				sum += 1;
				sum += itera(i, j+1, r, c, grid);
			}
		}
		if (j-1 >= 0){
			if (grid[i][j-1] == 1){
				grid[i][j-1] = -1;
				sum += 1;
				sum += itera(i, j-1, r, c, grid);
			}
		}
		return sum;
	}
}