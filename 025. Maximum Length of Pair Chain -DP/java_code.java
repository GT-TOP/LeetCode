class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.sort(pairs,(a,b)->(a[0]-b[0]));
        for (int i = 0; i < n; i++)
           dp[i] = 1;
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (pairs[j][1] < pairs[i][0] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
            }
        }
        
        return dp[n-1];
    }
}
