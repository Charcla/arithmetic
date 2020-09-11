package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skyou on 2019/5/27.
 */
public class Solution532 {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0||k<0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(k==0){
                if(en.getValue()>1){
                    count++;
                }
            }else{
                if(map.containsKey(en.getKey()+k)){
                    count++;
                }
            }
        }
        return count;
    }
}
