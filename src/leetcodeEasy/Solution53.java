package leetcodeEasy;

public class Solution53 {
	public int maxSubArray(int[] nums) {
		if(nums.length==0){
			return nums[0];
		}

		//这个dp[i]表示已第i个元素结尾的序列的最大值
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		int max=dp[0];
		for(int i=1;i<nums.length;i++){
			dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
			if(dp[i]>max){
				max=dp[i];
			}
		}
		return max;
		   
    }
}
