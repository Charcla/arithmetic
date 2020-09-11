package leetCodeMedium;

import java.util.List;

public class Solution120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		//从最底下一层开始往上面推，dp[i][j]表示第i层第j个位置的最优解，
		//dp[i][j]=min(dp[i+1][j],dp[i+1][j+1])+triangle[i][j]
        int[][] dp=new int[triangle.size()+1][triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
        	List<Integer> cur=triangle.get(i);
        	for(int j=0;j<cur.size();j++){
        		dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1])+cur.get(j);
        	}
        }
        return dp[0][0];
    }
}
