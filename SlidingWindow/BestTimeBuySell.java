class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public void main(String[] args) {
        int[] prices1 = {10, 1, 5, 6, 7, 1};
        int[] prices2 = {10, 8, 7, 5, 2};

        System.out.println("Maximum Profit (Example 1): " + maxProfit(prices1)); 
        System.out.println("Maximum Profit (Example 2): " + maxProfit(prices2)); 
    }
}

    
