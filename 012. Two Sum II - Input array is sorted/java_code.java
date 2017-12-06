class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int tmp = 0, flag = 0;
        int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++){
            tmp = target - numbers[i];
            flag = 0;
            index[0] = i + 1;
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[j] < tmp)
                    continue;
                else if (numbers[j] == tmp){
                    index[1] = j + 1;
                    flag = 1;
                    break;
                }
                else
                    break;
            }
            if (flag == 1)
                break;
        }
        return index;
    }
}
