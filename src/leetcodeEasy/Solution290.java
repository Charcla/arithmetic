package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {
	public boolean wordPattern(String pattern, String str) {
        String[] s=str.split(" ");
        Map<Character,String> map=new HashMap<>();
        if(pattern.length()!=s.length)
            return false;
        for(int i=0;i<pattern.length();i++){
        	char c=pattern.charAt(i);
        	if(map.containsKey(c)){
        		if(!map.get(c).equals(s[i])){
        			return false;
        		}
        	}else{
        		if(!map.containsValue(s[i]))
        			map.put(c, s[i]);
        		else
        			return false;
        	}
        }
        return true;
    }
}
