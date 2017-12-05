找出数组中的全部重复元素
=
标签：array  
题目实现简单，只不过要求‘without extra space and in O(n) runtime’，关键在于如何利用1 ≤ a[i] ≤ n (n = size of array)这个条件  =
discuss中最高亮的方法：通过将元素对应下标位置上的元素取反来判断，之前自己也这样考虑过，只是没想到取反这样的方法，非常tricky  =
提交的方法：利用hashmap键的唯一性来做，这样需要额外的空间，不是最优；但也是了解了一些java的语法知识  
list列表必须按照插入的顺序保存元素，而set不允许有重复元素，一般常用两种类型list：  
//		ArrayList和LinkedList的大致区别：   
//	     1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。   
//	     2.对于随机访问get和set，ArrayList优于LinkedList，因为LinkedList要移动指针。   
//	     3.对于新增和删除操作add和remove，LinedList占优势，因为ArrayList要移动数据。
