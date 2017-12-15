# 任务调度  
---
标签：array，greedy，queue  
* 思路：为每个task维护一个剩余任务数和一个cooling intervals，这样就可以按照要求执行所以任务；  
  如果要达到最优，需要在每一次执行之前，找出剩余任务数最多的待执行task，这样会提高效率
