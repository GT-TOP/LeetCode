class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int maxi = 0;
        for (int e: nums){
            if (e == 1)
                i++;
            else{
                if (i > maxi)
                    maxi = i;
                i = 0;
            }
        }
        if (i > maxi)
            maxi = i;
        return maxi;
    }
}
