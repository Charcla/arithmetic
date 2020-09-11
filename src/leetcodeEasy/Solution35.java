package leetcodeEasy;

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
        int left=0;int right=nums.length-1;
        int mid;
        while(left<right){
        	mid=(left+right)/2;
        	if(target==nums[mid]){
        		return mid;
        	}else if(target>nums[mid]){
        		left=mid+1;
        	}else{
        		right=mid-1;
        	}
        }
        if(target>nums[left]){
        	return ++left;
        }else{
        	return left;
        }
    }
}
