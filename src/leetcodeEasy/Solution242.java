package leetcodeEasy;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
        int[] hash=new int[128];
        if(s.length()!=t.length())
        	return false;
        for(int i=0;i<s.length();i++){	
        	hash[s.charAt(i)]++;
        	hash[t.charAt(i)]--;
        }
        for(int i=0;i<hash.length;i++){
        	if(hash[i]!=0){
        		return false;
        	}
        }
        return true;
    }
}
