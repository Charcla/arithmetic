package leetcodeEasy;

public class Solution53 {
	public int maxSubArray(int[] nums) {
		if(nums.length==0){
			return nums[0];
		}

		//���dp[i]��ʾ�ѵ�i��Ԫ�ؽ�β�����е����ֵ
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
