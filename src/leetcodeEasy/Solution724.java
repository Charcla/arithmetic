package leetcodeEasy;

public class Solution724 {
	public static int pivotIndex(int[] nums) {
		int sum=0;
		for(int s:nums)
			sum+=s;
		int numLeft=0;
		for(int i=0;i<nums.length;i++){
			numLeft+=nums[i];
			if(sum-nums[i]-numLeft==numLeft)
				return i;
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
	}
}
