class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        a = prices
        buy =prices[0]
        sell_profit = 0
        for i in a:
            if i < buy:
                buy = i
            elif (i-buy>sell_profit):
                sell_profit= i-buy
        return sell_profit