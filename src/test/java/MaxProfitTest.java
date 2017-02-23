import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/18/17.
 */
class MaxProfitTest {
    List<Double> prices  = Arrays.asList(310d, 315d, 275d, 295d, 260d, 270d, 290d, 230d, 255d, 250d);
    List<Double> prices1 = Arrays.asList(12d, 11d, 13d, 9d, 12d, 8d, 14d, 13d, 15d);

    @Test
    public void getMaxProfit() {
        Double max = MaxProfit.buyAndSellOnce(prices);
        System.out.println(prices);
        System.out.println("\tBuy-and-Sell Once Max Profit:  " + max);
        assertEquals((Double)30.0, max);
    }

    @Test
    public void getMaxProfitForTwiceBuyAndSell() {
        Double max = MaxProfit.twiceBuyAndSell(prices1);
        assertEquals((Double) 10d, max);
        System.out.println(prices1);
        System.out.println("\tBuy-and-Sell Twice Max Profit: " + max);
    }
}