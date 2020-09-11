package leetCodeMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution347 {
	public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
        	if(map.containsKey(n)){
        		map.put(n, map.get(n)+1);
        	}else{
        		map.put(n, 1);
        	}
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((v1,v2)->v2.getValue()-v1.getValue());
        pq.addAll(map.entrySet());
        for(int i=0;i<k;i++)
        	list.add(pq.poll().getKey());
        return list;
    }
	
	public static void main(String[] args) {
		int[] arr={1,1,1,2,2,3};
		List<Integer> l=topKFrequent(arr, 2);
		for(int n:l)
			System.out.println(n);
	}
}
