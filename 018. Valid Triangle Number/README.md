# 找出数组中可以构成三角形的数字组合  
---
标签：array  

* 思路：一开始用增量构造法来生成包含三个元素的子集，相当于遍历，结果TLE；  
  参考discussion，先排序，然后利用three pointers，如果left + right > i，则一定可以构成三角形，简化判断逻辑 
