class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] p = new int[n];
        int[] np = new int[n];
        p[0] = cost[0];
        for (int i = 1; i < n; i++){
            p[i] = Math.min(p[i-1],np[i-1]) + cost[i];
            np[i] = p[i-1];
        }
        
        return Math.min(np[n-1], p[n-1]);
    }
}
