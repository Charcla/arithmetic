package leetcodeEasy;

public class Solution709 {
	public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
        		sb.append((char)(str.charAt(i)+32));
        	}else{
        		sb.append((char)str.charAt(i));
        	}
        }
        return sb.toString();
    }
}
