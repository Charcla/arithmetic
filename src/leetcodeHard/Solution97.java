package leetcodeHard;

public class Solution97 {
	public static boolean isInterleave(String s1, String s2, String s3) {
		int[] hash=new int[128];
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			hash[c]++;
		}
		for(int i=0;i<s2.length();i++){
			char c=s2.charAt(i);
			hash[c]++;
		}
		for(int i=0;i<s3.length();i++){
			char c=s3.charAt(i);
			hash[c]--;
			if(hash[c]<0)
				return false;
		}
		for(int i=0;i<hash.length;i++)
			if(hash[i]!=0)
				return false;
		return true;
			
    }
	public static void main(String[] args) {
		System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
	}
	
}
