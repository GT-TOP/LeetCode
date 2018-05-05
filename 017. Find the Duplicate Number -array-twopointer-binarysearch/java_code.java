class Solution {
    public int findDuplicate(int[] nums) {
		int n = nums.length - 1;
		int left = 1, mid = 0, right = n;
		int count = 0;
		while (left < right){
			count = 0;
			mid = (left + right) / 2;
			for (int i = 0; i < n + 1; i++){
				if (nums[i] <= mid)
					count++;
			}
			if (count > mid){
				right = mid;
			}
			else{
				left = mid + 1;
			}
		}
		return left;
    }
}
