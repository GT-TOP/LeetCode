class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        int tmp = 0, maxi = 0;
        for (int i = 0; i < nums.length; i++){
            if (hm.containsKey(nums[i])){
                tmp = hm.get(nums[i]);
                tmp++;
                hm.put(nums[i], tmp);
            }
            else
                hm.put(nums[i], 1);
        }
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) iter.next();
            int value = (int) entry.getValue();
            System.out.println(value);
            if (value > nums.length/2){
                maxi = (int) entry.getKey();
                break;
            }
        }
        return maxi;
    }
}
