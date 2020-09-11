package leetcodeEasy;

public class Solution121 {
	public int maxProfit(int[] prices) {
//		if(prices.length==0)
//			return 0;
//		//dp[i]�ͱ�ʾ��i��������������
//        int[] dp=new int[prices.length+1];
//        int min=prices[0];
//        int maxProfit=0;
//        for(int i=1;i<prices.length;i++){
//        	if(prices[i]<min){
//        		min=prices[i];
//        	}
//        	dp[i]=Math.max(dp[i-1],prices[i]-min);
//        	if(dp[i]>maxProfit)
//        		maxProfit=dp[i];
//        }
//        return maxProfit;
		//dp_i_0,��ʾ��i�첻���й�Ʊ�����󣬳�ʼֵ��ʾ������
		//dp_i_1,��ʾ��i����й�Ʊ�����󣬱�ʾ�������������
		int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
		for(int i=0;i<prices.length;i++){
			dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
			dp_i_1=Math.max(dp_i_1, -prices[i]);
		}
		return dp_i_0;
    }
}
