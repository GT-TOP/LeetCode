class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		int[] a = new int[100];
		Arrays.sort(candidates);
		ArrayList al = new ArrayList ();
		//多一个参数numc记录当前所利用的最小元素下标
		subsets(al,candidates,a,target,0,0);
		return al;
	}
	public static void subsets(ArrayList al, int[] candidates, int[] a, int target, int cur, int numc){
		ArrayList tmp = new ArrayList ();
		int count = 0;
		for (int i = 0; i < cur; i++){
			tmp.add(a[i]);
			count += a[i];
		}
		if (count == target){
			al.add(tmp);
			return;
		}
		if (count > target)
			return;
		
		for (int i = numc; i < candidates.length; i++){
			a[cur] = candidates[i];
			subsets(al,candidates,a,target,cur+1, i);
		}
	}
}
