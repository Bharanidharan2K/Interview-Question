package com.best_time_to_buy_and_sell_stock;

public class Main {

	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int maxProfif = 0;
		int slowPtrForBuy = 0, fastPtrForSell = 1;
		while(fastPtrForSell < prices.length) {
			if(prices[slowPtrForBuy] < prices[fastPtrForSell]) {
				int diff = prices[fastPtrForSell] - prices[slowPtrForBuy];
				maxProfif = Math.max(maxProfif, diff);
			}
			else {
				slowPtrForBuy = fastPtrForSell;
			}
			fastPtrForSell += 1;
		}
		return maxProfif;
	}
}
