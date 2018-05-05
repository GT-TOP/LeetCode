class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
		int r1 = 0;
		int c1 = 0;
		if (r*c == nums.length*nums[0].length){
            int[][] nums_reshape = new int[r][c];
			for (int i=0; i<nums.length; i++)
				for (int j=0; j<nums[0].length; j++){
					if (c1 == c){
						c1 = 0;
						r1 += 1;
					}
					nums_reshape[r1][c1++] = nums[i][j];
				}
			return nums_reshape;
		}
		else
			return nums;
    }
}
