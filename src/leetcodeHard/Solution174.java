package leetcodeHard;

public class Solution174 {
	public static int calculateMinimumHP(int[][] dungeon) {
        int row=dungeon.length;
        int col=dungeon[0].length;
        //��������ʾ��i,jλ����ʿ��Ҫ����С����ֵ
        int[][] dp=new int[row][col];
        for(int i=row-1;i>=0;i--){
        	for(int j=col-1;j>=0;j--){
        		if(i==row-1&&j==col-1){ //�յ�����
        			dp[i][j]=Math.max(1, 1-dungeon[i][j]);
        		}else if(i==row-1){ //���һ�е����
        			dp[i][j]=Math.max(1, dp[i][j+1]-dungeon[i][j]);
        		}else if(j==col-1){ //���һ�е����
        			dp[i][j]=Math.max(1, dp[i+1][j]-dungeon[i][j]);
        		}else{	
        			dp[i][j]=Math.max(1, Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j]);
        		}
        	}
        }
        return dp[0][0];
    }
	public static void main(String[] args) {
		int[][] a=new int[][]{{100}};
		System.out.println(calculateMinimumHP(a));
	}
}
