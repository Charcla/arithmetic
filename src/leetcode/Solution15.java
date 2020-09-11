package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * @param nums
 * @return
 */
public class Solution15 {
	
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();		
        Arrays.sort(nums);
        int i=0,j=1,k=nums.length-1;
        if(k==0){
            return null;
        }
        if(nums[k]==0){
        	List<Integer> l=new ArrayList<>();
    		l.add(0);
    		l.add(0);
    		l.add(0);
    		list.add(l);
    		return list;
        }
        while(i<k&&j<k){
        	int i1=i,j1=j,k1=k;
        	while(j1<k1){
        		if(nums[i1]+nums[j1]+nums[k1]==0){
            		List<Integer> l=new ArrayList<>();
            		l.add(nums[i1]);
            		l.add(nums[j1]);
            		l.add(nums[k1]);
            		list.add(l);
            		j1++;k1--;
            	}else if(nums[i1]+nums[j1]+nums[k1]<0){
            		j1++;
            	}else{
            		k1--;
            	}
        	}
        	i++;j++;k=nums.length-1;
        }
        //去重
        LinkedHashSet<List<Integer>> set=new LinkedHashSet<>(list.size());
        set.addAll(list);
        list.clear();
        list=new ArrayList<>(set);
        return list;
       
    }
	
	public static void main(String[] args) {
		int[] nums={};
		List<List<Integer>> list=threeSum(nums);
		list.size();
	}

}
