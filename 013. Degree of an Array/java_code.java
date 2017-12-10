class Solution {
    public int findShortestSubArray(int[] nums) {
        int tmp = 0;
		HashMap<Integer, Integer> hm = new HashMap<> ();
		ArrayList al = new ArrayList ();
		for (int e: nums){
			if (hm.containsKey(e)){
				tmp = hm.get(e);
				tmp++;
				hm.put(e, tmp);
			}
			else
				hm.put(e, 0);
		}
		Iterator iter = hm.entrySet().iterator();
		int maxi = 0;
		while (iter.hasNext()){
			HashMap.Entry entry = (HashMap.Entry) iter.next();
			int value = (int) entry.getValue();
			int key = (int) entry.getKey();
			if (value > maxi){
				al.clear();
				al.add(key);
				maxi = value;
			}
			else if (value == maxi)
				al.add(key);
		}
		int minl = nums.length;
		for (Object e: al){
			int t = (int) e;
			int l = 0, r = 0;
			for (int i = 0; i < nums.length; i++){
				if (nums[i] == t){
					l = i;
					break;
				}
			}
			for (int i = nums.length - 1; i >= 0; i--){
				if (nums[i] == t){
					r = i;
					break;
				}
			}
			if (r - l < minl)
				minl = r - l;
		}
		return minl + 1;
    }
}
