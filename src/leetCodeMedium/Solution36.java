package leetCodeMedium;

public class Solution36 {
	public boolean isValidSudoku(char[][] board) {
		//记录某行某个数字是否已经有了
        boolean[][] row=new boolean[9][10];
        boolean[][] col=new boolean[9][10];
        boolean[][] blo=new boolean[9][10];
        
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j]!='.'){
        			int num=board[i][j]-'0';
        			if(row[i][num]||col[j][num]||blo[i/3*3+j/3][num]){
        				return false;
        			}else{
        				row[i][num]=true;
        				col[j][num]=true;
        				blo[i/3*3+j/3][num]=true;
        			}
        		}
        	}
        }    
        return true;
    }
}
