package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/9/4 15:37
 */
public class Solution766 {
    /**
     * 上一行的数组除去最后一个元素=下一行的数组除去
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix==null){
            return false;
        }
        if (matrix.length==1||matrix[0].length==1){
            return true;
        }
        int col=matrix.length;
        int row=matrix[0].length;
        for(int i=0;i<col-1;i++){
            for(int j=0;j<row-1;j++){  //判断数组是否相等
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
