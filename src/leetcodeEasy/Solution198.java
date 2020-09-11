package leetcodeEasy;

public class Solution198 {
	public int rob(int[] nums) {
		//这个数组dp[i]就表示前i个房间的最优解
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0],nums[1]);
		for(int i=2;i<nums.length;i++){
			//肯定是取前i-1个房间的解和前i-2的房间的解+当前房间的解的最大值
			dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
		}
		return dp[nums.length-1];
	}

}
