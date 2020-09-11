package leetcodeEasy;

public class Solution122 {
	public int maxProfit(int[] prices) {
//        int maxProfit=0;
//        for(int i=1;i<prices.length;i++){
//        	if(prices[i]>prices[i-1])
//        		maxProfit+=prices[i]-prices[i-1];
//        }
//        return maxProfit;
        //dp_i_0,表示第i天不持有股票的利润，初始值表示无利润
        //dp_i_1,表示第i天持有股票的利润，表示不存在这种情况
        int n=prices.length;
        int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=dp_i_0;
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,temp-prices[i]);
        }
        return dp_i_0;
    }
}
