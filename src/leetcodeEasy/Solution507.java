package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution507 {
	public static boolean checkPerfectNumber(int num) {
		if(num==0)
			return false;
		int s=0;
		for(int i=1;i<num/i;i++){
			if(num%i==0){
				s+=i;
                s+=num/i;
			}
		}
		if(2*num==s){
			return true;
		}
		return false;
    }
	public static void main(String[] args) {
		checkPerfectNumber(28);
	}
}
