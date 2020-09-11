package leetCodeMedium;

import java.util.Arrays;

public class Solution322 {
	public static int coinChange(int[] coins, int amount) {
        //dp[i]就表示金额为i需要的最小硬币
		int[] dp=new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		for(int i=1;i<=amount;i++){
			for(int j=0;j<coins.length;j++){
				if(i-coins[j]>=0){
					dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
				}
			}
		}
		return dp[amount]==amount+1?-1:dp[amount];
        
    }
	public static void main(String[] args) {
		System.out.println(coinChange(new int[]{1,2,5},11));
	}
}
