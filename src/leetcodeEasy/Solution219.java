package leetcodeEasy;

import java.util.Arrays;

public class Solution219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int[] hash=new int[k+1];
		for(int i=0;i<nums.length-k;i++){
			for(int j=i;j<=k;j++){
				int index=nums[j]%Integer.MAX_VALUE;
				hash[index]++;
				if(hash[index]>1){
					return true;
				}
			}
			Arrays.fill(hash,0);
		}
		return false;
    }
	public static void main(String[] args) {
		int[] nums={1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums,2));
	}
}
