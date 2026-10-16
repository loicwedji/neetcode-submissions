class Solution {
    public int maxProfit(int[] prices) {
        int small = Integer.MAX_VALUE; //tracks the smallest value
        int profit = 0;
      for(int i = 0; i<prices.length; i++){
        if(prices[i]<small){  //current value is smaller than smallest value
            small = prices[i]; //set as smallest value
        }else{ //if we found a larger value
        profit = (prices[i] - small)> profit?prices[i]-small:profit; // if profit is larger change it otherwise stays the same

        }
      }  
      return profit;
    }
}
