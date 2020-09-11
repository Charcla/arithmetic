package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution560 {
	//map存储每种和对应的子数组的个数
	public int subarraySum(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 1);
		int sum=0,ret=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(map.containsKey(sum-k)){
				ret+=map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum, 0)+1);
		}
		return ret;
    }
}
