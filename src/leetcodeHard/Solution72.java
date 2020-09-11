package leetcodeHard;

public class Solution72 {
	public static int minDistance(String word1, String word2) {
        int len1=word1.length(),len2=word2.length();
        //dp[i][j]��ʾword1��[1,i]��word2��[1,j]������ȫһ����Ҫ�����Ĵ���
        int[][] dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
        	dp[i][0]=i;
        }
        for(int j=0;j<=len2;j++){
        	dp[0][j]=j;
        }
        for(int i=0;i<len1;i++){
        	for(int j=0;j<len2;j++){
        		if(word1.charAt(i)==word2.charAt(j)){
        			dp[i+1][j+1]=dp[i][j];
        		}else{
        			dp[i+1][j+1]=Math.min(dp[i][j],Math.min(dp[i][j+1],dp[i+1][j]))+1;
        		}
        	}
        }
        return dp[len1][len2];
    }
	
	public static void main(String[] args) {
		String word1 = "horse", word2 = "ros";
		minDistance(word1, word2);
	}
	
}
