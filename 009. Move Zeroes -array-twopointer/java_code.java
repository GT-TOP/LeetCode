class Solution {
    public void moveZeroes(int[] nums) {
        rm(nums);
    }
    
    public int[] rm(int[] nums){
        int p = 0; 
		for (int i=0; i<nums.length; i++){
			if (nums[i] != 0){
				nums[p++] = nums[i];
			}		
		}
		for (int i=p; i<nums.length; i++)
			nums[i] = 0;
        return nums;
    }
}