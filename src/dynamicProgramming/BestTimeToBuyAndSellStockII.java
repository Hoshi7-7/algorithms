package dynamicProgramming;

public class BestTimeToBuyAndSellStockII {
    /*
        leetcode link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
        Time complexity: O(n), where n is the length of the prices array.
        Space complexity: O(n), for the dp array.
        This solution uses Dynamic Programming (DP) to find the maximum profit that can be achieved by buying and selling stocks multiple times.
        We maintain a dp array where dp[i] represents the maximum profit that can be achieved by day i.
        If the price on day i is greater than the price on day i-1, we can sell the stock bought on day i-1 to make a profit.
        Otherwise, we do not make any transaction on day i and carry forward the profit from day i-1.
     */
    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length];
        dp[0] = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                dp[i] = prices[i] - prices[i-1] +dp[i-1];
            }else{
                dp[i] = dp[i-1];
            }
        }

        return dp[prices.length - 1];
    }
}
