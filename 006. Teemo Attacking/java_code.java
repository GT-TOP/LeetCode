class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0)
            return 0;
		    int s1=0, e1=0, s0=-1, e0=-1, count=0, temp;
		    for (int e: timeSeries){
			    s1 = e;
			    e1 = e + duration - 1;
			    temp = 0;
			    if (e0 < s1)
				    temp = 0;
			    else
				    temp = e0 - s1 + 1;
			    count += (duration - temp);
			    e0 = e1;
			    s0 = s1;
		    }
		    return count;
    }
}
