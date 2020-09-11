package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution1481 {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

    }
}
