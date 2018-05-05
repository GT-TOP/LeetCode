class Solution {
    public int countSubstrings(String s) {
		char[] sc = s.toCharArray();
		int lens = s.length();
		int[][] dp = new int[lens][lens];
		//先确定长度为1和2的回文子串
		for (int i = 0; i < lens; i++){
			dp[i][i] = 1;
			if (i + 1 < lens && sc[i] == sc[i+1])
				dp[i][i+1] = 1;
		}
		
		//从长度为3的开始，逐行遍历
		//dp[i][j]即位置i到位置j的子串
		//判断方法：根据dp[i+1][j-1]的情况，结合i,j位置字符的情况，进行判断
		//相当于 判断长度n子串时，先找n-2子串，而这个结果已经算出来了
		for (int i = 3; i <= lens; i++){
			for (int j = 0; j < lens; j++){
				if (j + i - 1 < lens){
					if (sc[j] != sc[j+i-1]){
						dp[j][j+i-1] = 0;
						continue;
					}
					if (dp[j+1][j+i-2] == 1){
						dp[j][j+i-1] = 1;
					}
					else{
						dp[j][j+i-1] = 0;
					}
				}
			}
		}
		int count = 0;
		for (int i = 0; i < lens; i++){
			for (int j = 0; j < lens; j++){
				if (dp[i][j] == 1)
					count++;
			}
		}
		return count;
    }
}
