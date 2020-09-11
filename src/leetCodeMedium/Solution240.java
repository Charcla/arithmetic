package leetCodeMedium;

public class Solution240 {
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
        	return false;
        }
		int row=matrix.length-1;
        int col=matrix[0].length-1;
        int i=0;
		int j=col;
		while(i<=row&&j>=0){
        	if(matrix[i][j]==target){
        		return true;
        	}else if(matrix[i][j]>target){
        		j--;
        	}else{
        		i++;
        	}
        }
		return false;
    }
	public static void main(String[] args) {
		int[][] matrix={{1}};
		searchMatrix(matrix, 1);
	}
}
