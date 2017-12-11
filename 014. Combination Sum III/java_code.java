class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
		int[] a = new int[10];
		ArrayList al = new ArrayList ();
		ArrayList rl = new ArrayList ();
		print_subset(k, a, al, 0);
		for (Object e: al){
			ArrayList el = (ArrayList) e;
			int sums = 0;
			if (el.size() == k){
				for (int i = 0; i < k; i++){
					sums += (int) el.get(i);
				}
				if (sums == n)
					rl.add(el);
			}
		}
		return rl;
    }
    public static void print_subset(int k, int[] a, ArrayList al, int cur){
		ArrayList tmp = new ArrayList ();
		for (int i = 0; i < cur; i++){
			tmp.add(a[i]);
			//System.out.print(a[i]);
		}
		al.add(tmp);

		int minElem = 1;
		if (cur != 0)
			minElem = a[cur-1] + 1;
		if (cur == k)
			return;
		for (int i = minElem; i < 10; i++){
			a[cur] = i;
			print_subset(k, a, al, cur+1);
		}
	}
}
