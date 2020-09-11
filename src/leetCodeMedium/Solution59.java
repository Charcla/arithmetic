package leetCodeMedium;

/**
 * @author Charcl
 * @date 2019/7/29 20:16
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int c=1,j=0;
        while(c<=n*n){
            for (int i=j;i<n-j;i++)
                arr[j][i]=c++;
            for (int i = j + 1; i < n - j; i++)
                arr[i][n - j - 1] = c++;
            for (int i = n - j - 2; i >= j; i--)
                arr[n - j - 1][i] = c++;
            for (int i = n -j - 2; i > j; i--)
                arr[i][j] = c++;
            j++;
        }
        return arr;
    }
}
