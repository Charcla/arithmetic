package leetCodeMedium;

/**
 * @author Charcl
 * @date 2020/1/13 19:21
 */
public class Solution309 {

    public int maxProfit(int[] prices) {

        //dp_i_0,表示第i天不持有股票的利润，初始值表示无利润
        //dp_i_1,表示第i天持有股票的利润，表示不存在这种情况
        int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
        int dp_pre_0=0;//表示冷冻的那一天
        int n=prices.length;
        for (int i=0;i<n;i++){
            int temp=dp_i_0;
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,dp_pre_0-prices[i]);
            dp_pre_0=temp;
        }
        return dp_i_0;
    }
}
