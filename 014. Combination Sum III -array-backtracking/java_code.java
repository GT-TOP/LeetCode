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
	//递归得到10以内所有符合条件的子集，其中cur为当前下标，初始值为0
	//cur可以理解为遍历的图的层数
    public static void print_subset(int k, int[] a, ArrayList al, int cur){
		ArrayList tmp = new ArrayList ();
		for (int i = 0; i < cur; i++){
			tmp.add(a[i]);
		}
		al.add(tmp);
		//递归到了每一层，都将目前所生成的子集保存起来
		//按照原理图来理解

		int minElem = 1;
		//下句较为难懂，但也是核心点
		//即得到当前子集中“最新”的元素，利用原理图理解，即上一步生成过程中得到的元素
		//特殊情况为cur==0，也就是根节点处，这时候minElem应赋值为1
		if (cur != 0)
			minElem = a[cur-1] + 1;
		
		//以下可以设置一些限制条件
		if (cur == k)
			return;
		
		for (int i = minElem; i < 10; i++){
			a[cur] = i;
			//各子集在当前层(根据原理图理解)的值
			print_subset(k, a, al, cur+1);
			//cur+1表示当前层设置完毕，开始递归下一层，和前面步骤一样
			//到达最后一层结束后return回到上一层，然后i++，改变a[cur],即当前层的值改变，反复……
		}
	}
}
