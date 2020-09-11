package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	char s1=s.charAt(i);
        	char s2=t.charAt(i);
        	if(!map.containsKey(s1)){
        		if(map.containsValue(s2)){
        			return false;
        		}else
        			map.put(s1, s2);
        	}else{
        		if(!map.get(s1).equals(s2)){
        			return false;
        		}
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		
	}
}
