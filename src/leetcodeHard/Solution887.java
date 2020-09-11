package leetcodeHard;

public class Solution887 {
	public static int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        for (int m = 1; m <= N; m++) {
            dp[0][m] = 0; // zero egg
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
                if (dp[k][m] >= N) {
                    return m;
                }
            }
        }
        return N;  
    }
	public static void main(String[] args) {
		superEggDrop(2,6);
	}
}
