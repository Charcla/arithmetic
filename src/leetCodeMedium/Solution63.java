package leetCodeMedium;

public class Solution63 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row=obstacleGrid.length;
		int col=obstacleGrid[0].length;
        int[][] dp=new int[row][col];
        if(obstacleGrid[0][0]==1){ //��ʼ�����ϰ�������
        	return 0;
        }
        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		if(obstacleGrid[i][j]==0){
        			if(i==0&&j==0){ //��һ���ڵ�
        				dp[i][j]=1;
        			}else if(i==0){
        				dp[i][j]=dp[i][j-1];
        			}else if(j==0){
        				dp[i][j]=dp[i-1][j];
        			}else{       				
        				dp[i][j]=dp[i-1][j]+dp[i][j-1];
        			}
        		}else{
        			dp[i][j]=0;  //�����ǰԪ��Ϊ1����ô�ñ�ʾû��·��������
        			continue;
        		}
        	}    		
        }  
        return dp[row-1][col-1];
    }
	public static void main(String[] args) {
		int[][] o=new int[][]{{0,0,0},{1,1,1},{0,0,0}};
		uniquePathsWithObstacles(o);
	}
}
