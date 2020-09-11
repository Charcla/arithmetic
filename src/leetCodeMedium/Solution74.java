package leetCodeMedium;

public class Solution74 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0){
			return false;
		}
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
        	for(int j=col-1;j>=0;j--){
        		if(target==matrix[i][j]){
            		return true;
            	}else if(target>matrix[i][j]){
            		break;
            	}
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		int[][] a={{1,3}};
		System.out.println(searchMatrix(a, 1));
	}
}
