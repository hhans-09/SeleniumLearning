package LeetCode;

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * Example:
 * Input: prices = [7,1,5,3,6,4]
 * Output : 5  ( 6-1)
 * 
 * Input: prices = [7,6,4,3,1]
 * Output : 0
 * 
 */
public class BuySellStocks_121 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		int[] pricesw = {7,6,4,3,1};
		System.out.println(maxProfit(pricesw));

	}
	
	public static int maxProfit(int[] prices) {
		int max = 0;
		int min = prices[0];
		
		for(int i= 1; i < prices.length; i++) {
			if(min < prices[i]) {
				max = Math.max(max, prices[i]-min);
			} else {
				min = prices[i];
			}
			
				
		}
		
		return max;
	}
	

}
