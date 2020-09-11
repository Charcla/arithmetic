package leetCodeMedium;

/**
 * @author Charcl
 * @date 2019/11/18 19:47
 */
public class Solution807 {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rowMaxs=new int[n];
        int[] colMaxs=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowMaxs[i]=Math.max(rowMaxs[i],grid[i][j]);
                colMaxs[j]=Math.max(colMaxs[j],grid[i][j]);
            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans+=Math.min(rowMaxs[i],colMaxs[j])-grid[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}
