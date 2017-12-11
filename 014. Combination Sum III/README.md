# 组合数求和  
---
标签：array，backtracking
* 思路：根据题目要求，找到的k个数限制在1~9且不能重复，很自然地联想到利用生成子集  
  代码实现采用“增量构造法”，即每次只加入一个元素。 可以通过添加一些限制条件来控制所生成得子集。  
  根据原理图，同时结合代码来看，确实很自然

  原理图如下，类似于DFS，代码实现很自然：
  ![image](http://img.blog.csdn.net/20161114013615195?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
