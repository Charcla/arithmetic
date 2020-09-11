package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        resultList.add(list);
        int size=1;
        for(int i=0;i<nums.length;i++){
        	for(int j=0;j<size;j++){
        		list=new ArrayList<>(resultList.get(j));
        		list.add(nums[i]);
        		resultList.add(list);
        		size++;
        	}
        }   
        return resultList;
    }
	public static void main(String[] args) {
		int[] nums={1,2,3};
		subsets(nums);
	}
}
