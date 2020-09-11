package leetCodeMedium;

/**
 * @author Charcl
 * @date 2020/1/15 13:58
 */
public class Solution714 {

    public int maxProfit(int[] prices, int fee) {

        //dp_i_0,表示第i天不持有股票的利润，初始值表示无利润
        //dp_i_1,表示第i天持有股票的利润，表示不存在这种情况
        int n=prices.length;
        int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int temp=dp_i_0;
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]-fee);
            dp_i_1=Math.max(dp_i_1,temp-prices[i]);
        }
        return dp_i_0;
    }

    public static void main(String[] args) {
        Solution714 s=new Solution714();
        int[] a={1, 3, 2, 8, 4, 9};
        s.maxProfit(a,2);
    }
}
