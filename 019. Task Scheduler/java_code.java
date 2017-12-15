class Solution {
    public int leastInterval(char[] tasks, int n) {
		HashMap<Character, Integer> hm = new HashMap<> ();
		int len = tasks.length;
		for (int i = 0; i < len; i++){
			if (hm.containsKey(tasks[i])){
				int tmp = hm.get(tasks[i]);
				tmp++;
				hm.put(tasks[i], tmp);
			}
			else
				hm.put(tasks[i], 1);
		}
				
		int num_task = hm.size(); 
        int[] arr = new int[num_task];
        int[] brr = new int[num_task];

		Iterator iter = hm.entrySet().iterator();
		int t = 0;
		while (iter.hasNext()){
			HashMap.Entry entry = (HashMap.Entry) iter.next();
			arr[t++] = (int) entry.getValue();
		}
				
		int time_com = 0;
		while (len > 0){
		    //每次循环找出一个可执行任务：满足cooling intervals限制 且 任务尚未完成  且 剩余任务数最多
		    int maxi = -1, re = -1;
			for (int i = 0; i < num_task; i++){
				if (brr[i] == 0 && arr[i] > 0){
		            if (arr[i] > maxi){
		                maxi = arr[i];
		                re = i;
		            }
		        }
		    }
		    if (re == -1){
		    	time_com++;
				//idle interval 对于所有待执行任务都是一个cooling interval，故所有的等待时间都可以减一
				for (int i = 0; i < num_task; i++){
		            if (brr[i] > 0)
		            	brr[i] -= 1;
		        }
				continue;
		    }
		                
			arr[re] -= 1;
			len--;
			time_com++;
			//执行了某一个任务后，对于其他任务而言，都相当于一个cooling interval
			for (int j = 0; j < num_task; j++){
		        if (brr[j] > 0)
		        	brr[j] -= 1;
			}
		    //该任务执行结束后，需要n个cooling interval
		    brr[re] = n;

	}	
		return time_com;
    }
}
