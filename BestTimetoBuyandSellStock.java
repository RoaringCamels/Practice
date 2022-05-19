/**
 * You are given an integer array prices where prices[i] is the price of a given
 * stock on the ith day.
 * 
 * On each day, you may decide to buy and/or sell the stock. You can only hold
 * at most one share of the stock at any time. However, you can buy it then
 * immediately sell it on the same day.
 * 
 * Find and return the maximum profit you can achieve.
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class BestTimetoBuyandSellStock {
    /**
     * In this case, the best time to buy is day 2 with price 1 and to sell on day 3
     * with price 9 with
     * a maxProfit of 8. Similarly with day 5 and 6 with a total maxProfit of
     * 
     * @param args main method
     */
    public static void main(String[] args) {
        int[] prices = { 5, 1, 9, 10, 2, 5 };
        calculate(prices);
        System.out.println(calculate(prices));
    }

    public static int calculate(int prices[]) {
        int maxProfit = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[j - 1]) {
                maxProfit += prices[j] - prices[j - 1];
            }
        }
        return maxProfit;
    }
}
