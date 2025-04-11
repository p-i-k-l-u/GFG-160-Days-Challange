public class maximumProfit {
    

    // stock buy and sell

    public int maximumProfit(int prices[]) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        maximumProfit solution = new maximumProfit();

        // Example stock prices
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Call the function
        int result = solution.maximumProfit(prices);

        // Print the result
        System.out.println("Maximum Profit: " + result);
    }
}
