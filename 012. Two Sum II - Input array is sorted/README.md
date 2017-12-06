# 在已排序array中找出其和等于给定target的两个元素  
---
标签：array，two pointers， binary search  

* 思路：已排序的array，只有一种solution，选定index1后，向后遍历判断即可  
  题目提供的tag可以作为解题思路：**Two Pointers**，即首尾两个pointer，通过判断其和与target的大小关系来决定如何移动pointer；  __Binary Search__，选定index1后，利用二分查找确定index2  
                               
