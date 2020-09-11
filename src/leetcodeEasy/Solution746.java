package leetcodeEasy;

public class Solution746 {
	public int minCostClimbingStairs(int[] cost) {
        //dp[i]表示到达第i个阶梯需要的最小花费
		int[] dp=new int[cost.length+1];

		for(int i=2;i<=cost.length;i++){
			dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
		}	
		return dp[cost.length];
    }
}
