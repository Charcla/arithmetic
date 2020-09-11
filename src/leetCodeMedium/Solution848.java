package leetCodeMedium;

public class Solution848 {
	public static String shiftingLetters(String S, int[] shifts) {
		int[] shift=new int[S.length()];
		int sum=shift[shift.length-1];
		StringBuffer sb=new StringBuffer();
		for(int i=shift.length-1;i>=0;i--){
			shift[i]=(shifts[i]+sum);
			sum=shift[i];
		}
		for(int i=0;i<shifts.length;i++){
//			if((S.charAt(i)+shift[i])>122)
//				sb.append((char)(97+(S.charAt(i)+shift[i]-97)%26));
//			else
//				sb.append((char)(S.charAt(i)+shift[i]));
			sb.append((char)((S.charAt(i)+shift[i]%26)>122?(S.charAt(i)+shift[i]%26)-26:S.charAt(i)+shift[i]%26));
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		int[] res={505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
		System.out.println(shiftingLetters("mkgfzkkuxownxvfvxasy",res));
	}
	
}
