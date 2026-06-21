class Solution {
    public int maxProfit(int[] prices) {
        int maxcount = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int count = prices[j] - prices[i];

                if (count > maxcount) {
                    maxcount = count;
                }
            }
        }

        return maxcount;
    }
}