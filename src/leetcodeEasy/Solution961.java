package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class Solution961 {
	public int repeatedNTimes(int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:A){
        	if(map.containsKey(i))
        		return i;
        	else 
        		map.put(i, 1);
        }
        return 1;
    }
}
