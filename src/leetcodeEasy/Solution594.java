package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Charcl
 * @date 2019/8/23 15:10
 */
public class Solution594 {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int result=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                result=Math.max(result,map.get(key+1)+map.get(key));
            }
        }
        return result;
    }
}
