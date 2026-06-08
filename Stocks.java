import java.util.Scanner;
public class stocks {
    
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for(int i=0; i<n; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buyPrice = prices[i];

            }
        }
        return maxProfit;

    }
    public static void main(Solution args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
