package leetcodeEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Soulution1 {
	
	/*
	 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的 两个 整数。
	 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
	 * 
	 * 时间复杂度O(n)，空间复杂度O(n)(所需的控件取决hash表中存储的元素数量，最多n个)
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int m=target-nums[i];
			if(map.containsKey(m)){
				return new int[]{i,map.get(m)};
			}
			map.put(nums[i],i);
		}
		return null;
    }
}
