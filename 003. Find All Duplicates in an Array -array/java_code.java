class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> rlist = new ArrayList<Integer>();
		for (int i=0; i<nums.length; i++){
			if (hm.containsKey(nums[i]))
				rlist.add(nums[i]);
			else
				hm.put(nums[i],i);
		}
        return rlist;
    }
}
