# 找出数组中丢失的数字  
---
标签：array, math, bit manipulation  

* 思路：由于数据比较特殊，n ___distinct___ numbers ___0~n___ 组成数组，可以据此来考虑解决方案，这里采用了等差数列求和公式，通过减法就可以找到；  
  discussion里给出一种XOR 异或，即位操作的解决方案，将数组中数据与0~n做异或，因为相同的数异或为0，与0异或仍为自身(XOR满足交换律与结合律)，因此剩下的数一定是missing number；
