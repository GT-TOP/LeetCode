# 出现次数最多的元素(number>math.floor(n/2))
---
* 主要是学习一波Java知识：  
  hashmap初始化以及遍历方法,object类型可以进行强制类型转换为需要的类型  
  HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();  
  Iterator iter = hm.entrySet().iterator();  
  while (iter.hasNext()){  
       HashMap.Entry entry = (HashMap.Entry) iter.next();  
       int value = (int) entry.getValue();  
       int key = (int) entry.getKey();
 
