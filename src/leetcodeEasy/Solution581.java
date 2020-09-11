package leetcodeEasy;

public class Solution581 {
	public static int findUnsortedSubarray(int[] nums) {
		int start=-1,end=-1,n=nums.length;
		int max=nums[0],min=nums[n-1];
		for(int i=1;i<n;i++){
			max=Math.max(max, nums[i]);
			min=Math.min(min, nums[n-1-i]);
			if(nums[i]<max)
				end=i;
			if(nums[i-1-i]>min)
				start=n-i-1;
		}
		return end-start+1;
    }
	
	public static void main(String[] args) {
		int[] a={2,6,4,8,10,9,15};
		findUnsortedSubarray(a);
	}
}
