package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {

    public static int numIdenticalPairs(int[] nums) {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            int m=map.getOrDefault(n,0);
            res+=m;
            map.put(n,m+1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,1,1,3};
        Solution1512.numIdenticalPairs(a);
    }
}
