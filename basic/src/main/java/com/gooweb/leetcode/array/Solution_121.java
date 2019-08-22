package com.gooweb.leetcode.array;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/
 * 121. 买卖股票的最佳时机
 * @author sunteng
 * @create 2019-08-22 下午 5:39
 **/
public class Solution_121 {

    public int maxProfit(int[] prices) {

        //辅助存储空间：最低价
        int minPrice = Integer.MAX_VALUE;
        //辅助存储空间：最大利润
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            //当前值和最小价格比较；如果小于最低价格，则把当前值赋值给minPrice；否则当前价格减去最低价格minPrice 和 最大利润比较，
            // 如果大于maxProfit的值；则把差赋给变量maxProfit
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;

    }


    public static void main(String[] args) {

        int[] prices = new int[]{7,2,4,1,8};
        Solution_121 solution_121 = new Solution_121();
        int maxProfit = solution_121.maxProfit(prices);
        System.out.println(maxProfit);

    }

}
