package leetcodeEasy;

public class Solution657 {
	public boolean judgeCircle(String moves) {
//		if(moves.length()%4!=0){
//			return false;
//		}
		int lr=0,ud=0;
		//0,1,2,3分别代表上下左右
		for(int i=0;i<moves.length();i++){
			char s=moves.charAt(i);
			if(s=='U'){
				ud++;
			}else if(s=='D'){
				ud--;
			}else if(s=='L'){
				lr++;
			}else{
				lr--;
			}
		}
		if(lr==0&&ud==0){
			return true;
		}
		return false;       
    }
}
