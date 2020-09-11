package leetCodeMedium;

public class Solution152 {
	public static int maxProduct(int[] nums) {
		int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxResult = nums[0];
        
        for (int i = 1; i < nums.length; ++i)
        {
            int end1 = maxEnd * nums[i], end2 = minEnd * nums[i];
            maxEnd   = Math.max(Math.max(end1, end2), nums[i]);  
            minEnd   = Math.min(Math.min(end1, end2), nums[i]);
            maxResult = Math.max(maxResult, maxEnd);
        }
        return maxResult;       
    }
	public static void main(String[] args) {
		int[] nums={-2,3,-2,4,-6,1};
		maxProduct(nums);
	}
}
