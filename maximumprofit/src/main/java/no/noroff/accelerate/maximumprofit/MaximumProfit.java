package no.noroff.accelerate.maximumprofit;

import org.springframework.stereotype.Component;

@Component
public class MaximumProfit {

    public int maximumProfit(int[] prices) {
        
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }

}
