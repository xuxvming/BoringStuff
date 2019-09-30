package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStockII extends AbstractSolution {
    public BestTimeToBuyAndSellStockII(String questionName, String url) {
        super(questionName, url);
    }

    /**
     * space complexity O(1)
     * time complexity O(n)
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i< prices.length-1;i++){
            if(prices[i] < prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    /**
     * space complexity O(n)
     * time complexity O(1)
     */
    public int maxProfit2(int[] prices){
        List<Integer> profits = new ArrayList<>();
        for (int i = 0; i< prices.length-1;i++){
            profits.add(prices[i+1]-prices[i]);
        }
        int maxProfit = 0;
        if (!profits.isEmpty()){
            for (Integer num: profits){
                if (num > 0){
                    maxProfit += num;
                }
            }
        }
        return maxProfit;
    }
}
