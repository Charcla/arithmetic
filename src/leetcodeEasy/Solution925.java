package leetcodeEasy;

public class Solution925 {
	public static boolean isLongPressedName(String name, String typed) {
		if (name == typed) return true;
		int i=0,j=0,pre=0;
		if (name.length() > typed.length() || name.charAt(0) != typed.charAt(0) || name.charAt(name.length()-1) != typed.charAt(typed.length()-1)) 
			return false;
		while(i<name.length()&&j<typed.length()){
			if(name.charAt(i)==typed.charAt(j)){
				pre=i;
				i++;j++;
			}else if(typed.charAt(j)==name.charAt(pre)){
				j++;
			}else{
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isLongPressedName("pyplrz","ppyypllr"));
	}
}
