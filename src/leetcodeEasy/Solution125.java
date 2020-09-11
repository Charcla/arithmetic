package leetcodeEasy;

public class Solution125 {
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
        if(s.length()==0||s.length()==1){
        	return true;
        }
        int l=0,r=s.length()-1;
        while(l<r){
        	while(l<r&&((s.charAt(l)<97||s.charAt(l)>122)&&(s.charAt(l)<48||s.charAt(l)>47)))
        		l++;
        	while(l<r&&((s.charAt(r)<97||s.charAt(r)>122)&&(s.charAt(r)<48||s.charAt(r)>47)))
        		r--;
        	if(l>r||s.charAt(l)!=s.charAt(r))
        		return false;
        	else{
        		l++;r--;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("0p"));
	}
}
