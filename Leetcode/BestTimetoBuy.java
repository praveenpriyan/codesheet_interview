package Leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class BestTimetoBuy {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		
		int minPrice=Integer.MAX_VALUE;
		int maxPrice=0;

//		if(price.length==0 || prices==null)
//			return 0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrice) {
				minPrice=prices[i];
			}else if(prices[i]-minPrice > maxPrice) {
				maxPrice=prices[i]-minPrice;
			}
		}
		System.out.println(maxPrice);

	}

}
