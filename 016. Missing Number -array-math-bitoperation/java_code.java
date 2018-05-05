class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sums = 0;
        for (int i = 0; i < n; i++){
            sums += nums[i];
        }
        int tmp = (n+1) * n / 2;
        return tmp - sums;
    }
}
