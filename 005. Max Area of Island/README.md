面积最大的岛
=
标签：array，depth-first search  
max area of island 一个二维数组中 an island is a group of 1's connected 4-directionally (horizontal or vertical)  
* 思路：这题很明显需要递归解决，遍历数组元素，在每个(为1)位置都向四个方向搜索，如果是1则count并将其值改写为-1  
递归结束条件：当四个方向都没有1时，则返回到上一层  

Q：每个位置遍历完之后不需要恢复
-
//					for (int p=0; p<r; p++)  
//						for (int q=0; q<c; q++)  
//							grid[p][q] = Math.abs(grid[p][q]);  
grid[p][q]不可能同时属于两个island
