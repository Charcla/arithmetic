package leetcodeEasy;

public class Solution551 {
	public static boolean checkRecord(String s) {
		int a=0,l=0;
        for(int i=0;i<s.length();i++){
        	if('A'==s.charAt(i)){
        		a++;
        	}
        	if('L'==s.charAt(i)){
        		l++;
        		if(l>2)
        			return false;
        	}else{
                l=0;
            }
        }
        if(a<=1)
        	return true;
        return false;
    }
	
	public static void main(String[] args) {
		checkRecord("PPALLP");
		char a='A';
		char b='A';
		System.out.println(a==b);
	}
}
