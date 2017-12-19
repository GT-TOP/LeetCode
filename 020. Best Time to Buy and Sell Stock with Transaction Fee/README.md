# 带交易费用的股票买卖(可多次)  
---
标签：array，DP，贪心  
* 思路：先定义状态 buy[i]表示第i天进行买操作能获得的最大收益， sell[i]表示第i天进行卖操作能获得的最大收益；  
  边界值 buy[0] = - prices[0]，买一件，sell[0] = 0, 不能卖  
  状态转移 buy[i] = max(sell[i-1] - prices[i], buy[i-1])  sell[i] = max(buy[i-1] + prices[i] - fee, sell[i-1])  
  
