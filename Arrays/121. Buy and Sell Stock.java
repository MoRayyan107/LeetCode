// Time Compexity -> O(n), Space Complexity -> O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            // check for min val
            if (prices[i] < minVal)
                minVal = prices[i];

            // check any profit made
            if((prices[i] - minVal) > profit)
                profit = prices[i] - minVal;
        }
        
        return profit;
    }
}
