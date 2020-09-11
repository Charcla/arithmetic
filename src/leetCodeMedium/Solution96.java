package leetCodeMedium;

public class Solution96 {
	public static int numTrees(int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				dp[i]=dp[i]+dp[j]*dp[i-1-j];
			}
		}
		return dp[n];
    }
	
	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}
}
