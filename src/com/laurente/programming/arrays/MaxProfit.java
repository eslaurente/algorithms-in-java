import java.util.ArrayList;
import java.util.List;

public class MaxProfit {

    /**
     *  EPI 6.6 (p. 70)
     *  Buy and Sell a Stock Once - Write a program that takes an array denoting the daily stock price, and returns
     *  the maximum profit that could be made by buying and then sellling one share of that stock.
     */
    public static Double buyAndSellOnce(List<Double> P) {
        int n = P.size();

        // Check max profit forwards:
        Double maxProfit = 0d;
        Double minPrice     = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice  = Math.min(minPrice, P.get(i));
            maxProfit = Math.max(maxProfit, P.get(i) - minPrice);
        }
        return maxProfit;
    }

    /**
     *  EPI 6.7 (pp. 71-72)
     *  Buy and Sell a Stock Twice - Write a program that computes the maximum profit that can be made by buying
     *  and then selling again. The second buy must be made after the first buy.
     */
    public static Double twiceBuyAndSell(List<Double> P) {
        Double maxProfit = 0d;
        int n = P.size();

        // Check max profit forwards:
        List<Double> firstBuySell = new ArrayList<>();
        Double minPrice     = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice  = Math.min(minPrice, P.get(i));
            maxProfit = Math.max(maxProfit, P.get(i) - minPrice);
            firstBuySell.add(maxProfit);
        }

        // Check max profit backwards:
        Double maxPrice = Double.MIN_VALUE;
        for (int i = n - 1; i > 0; i--) {
            maxPrice  = Math.max(maxPrice, P.get(i));
            maxProfit = Math.max(maxProfit, maxPrice - P.get(i) + firstBuySell.get(i - 1));
        }

        return maxProfit;
    }











}
