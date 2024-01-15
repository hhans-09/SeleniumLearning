package LeetCode;

/*
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time. 
 * However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
 * Example:
 * Input: prices = [7,1,5,3,6,4]
 * Output : 7  ( 5-1 = 4) + (6-3 = 3)
 * 
 * Input: prices = [7,6,4,3,1]
 * Output : 0
 * 
 */
public class BuySellStocksII_122 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		int[] pricesw = {7,6,4,3,1};
		System.out.println(maxProfit(pricesw));
		int[] pricesq = {1,2,3,4,5};
		System.out.println(maxProfit(pricesq	));
	}
	
	public static int maxProfit(int[] prices) {
		int max = 0;
		
		for(int i = 1; i < prices.length; i++) {
			if(prices[i-1] < prices[i]) {
				max += prices[i]-prices[i-1];
			}
		}
		
		return max;
	}
	

}
