package leetcodeEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution350 {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums1){
        	int num=map.getOrDefault(i, 0);
        	map.put(i, num+1);
        }
        for(int i:nums2){
        	int num=map.getOrDefault(i, 0);
        	if(num>0){
        		list.add(i);
        		map.put(i, num-1);
        	}
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++)
        	res[i]=list.get(i);
        return res;
    }
}
