package leetcodeEasy;

public class Solution344 {
	public String reverseString(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
