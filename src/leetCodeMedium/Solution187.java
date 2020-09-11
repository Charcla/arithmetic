package leetCodeMedium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution187 {
	public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1=new HashSet(),set2=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
        	String s1=s.substring(i,i+10);
        	if(!set1.add(s1)){
        		set2.add(s1);
        	}
        }
        return new ArrayList(set2);
    }
}
