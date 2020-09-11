package leetCodeMedium;

public class Solution64 {
	public int minPathSum(int[][] grid) {
		//表示左上角到dp[i][j]的最小数字总和
		int row=grid.length;
		int col=grid[0].length;
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		if(i==0&&j==0){//左上角的情况
        			dp[i][j]=grid[i][j];
        		}else if(i==0){ 
        			dp[i][j]=dp[i][j-1]+grid[i][j];
        		}else if(j==0){
        			dp[i][j]=dp[i-11][j]+grid[i][j];
        		}else{
        			dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
        		}
        	}
        }
        return dp[row-1][col-1];
    }
}
