import java.util.Scanner;

public class Reshape_the_Matrix {
	public static int[][] main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] nums = new int[r][c];
		for (int i=0; i<r; i++){
			for (int j=0; j<c; j++){
				nums[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(nums.length);
		int rn = sc.nextInt();
		int cn = sc.nextInt();
		sc.close();
		int[][] nums_reshape = new int[rn][cn];
		int r1 = 0;
		int c1 = 0;
		if (rn*cn == nums.length*nums[0].length){
			for (int i=0; i<nums.length; i++)
				for (int j=0; j<nums[0].length; j++){
					if (c1 == cn){
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
