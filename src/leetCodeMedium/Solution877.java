package leetCodeMedium;

public class Solution877 {
	public static boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][] dp=new int[n][n];//dp[i][i]表示第i步A能赢得的分数
        for(int i=0;i<n;i++){
        	dp[i][i]=piles[i];
        }
        for(int i=1;i<=n;i++){
        	for(int j=0;j<n-i;j++){
        		dp[j][j+i]=Math.max(piles[j]-dp[j+1][j+i],piles[j+i]-dp[j][j+i-1]);
        	}
        }
        return dp[0][n-1]>0;
        
    }
	public static void main(String[] args) {
		int[] p={5,3,4,5};
		stoneGame(p);
	}
	
}
