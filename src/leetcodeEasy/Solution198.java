package leetcodeEasy;

public class Solution198 {
	public int rob(int[] nums) {
		//�������dp[i]�ͱ�ʾǰi����������Ž�
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0],nums[1]);
		for(int i=2;i<nums.length;i++){
			//�϶���ȡǰi-1������Ľ��ǰi-2�ķ���Ľ�+��ǰ����Ľ�����ֵ
			dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
		}
		return dp[nums.length-1];
	}

}
