class Solution {
    public int integerBreak(int n) {
        int p = 2;
        int pro1 = 1, pro2 = 1;
        for (int i = 2; i <= n; i++){
            int tmp = i % p;
            int num = i / p;
            pro1 = 1;
            for (int j = 0; j < p - tmp; j++){
                pro1 *= num;
            }
            for (int j = 0; j < tmp; j++){
                pro1 *= (num+1);
            }
            
            pro2 = 1;
            tmp = i % (p+1);
            num = i / (p+1);
            for (int j = 0; j < p - tmp + 1; j++){
                pro2 *= num;
            }
            for (int j = 0; j < tmp; j++){
                pro2 *= (num+1);
            }
            
            if (pro2 > pro1){
                p += 1;
            }
        }
        
        return Math.max(pro1,pro2);
    }
}
