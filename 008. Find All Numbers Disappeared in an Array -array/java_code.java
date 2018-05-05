class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<> ();
		ArrayList list = new ArrayList ();
		for (int i=0; i<nums.length; i++){
			map.put(nums[i],i);
		}
		for (int i=0; i<nums.length; i++){
			if (map.containsKey(i+1))
				continue;
			else
				list.add(i+1);
		}
		return list;
    }
}
