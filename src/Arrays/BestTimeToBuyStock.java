package Arrays;

public class BestTimeToBuyStockg {

    public static int maxProfit(int[] prices) {

        int currentProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int dailyChange = prices[i] - prices[i - 1];

            currentProfit = Math.max(0, currentProfit + dailyChange);

            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);

        System.out.println("Maximum profit: " + answer);
    }
}