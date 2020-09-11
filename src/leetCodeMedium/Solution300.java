package leetCodeMedium;

import java.util.Arrays;

public class Solution300 {
	/**
	 * 时间复杂度O(n²)
	 * @param nums
	 * @return
	 */
	public static int lengthOfLIS(int[] nums) {
		if(nums.length==0){
			return 0;
		}
		//dp[i]就表示以i结尾的的最长上升序列
        int[] dp=new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLength=1;
        for(int i=1;i<nums.length;i++){
        	for(int j=0;j<i;j++){
        		if(nums[i]>nums[j])
        			dp[i]=Math.max(dp[i], dp[j]+1);
        	}
        	maxLength=Math.max(maxLength, dp[i]);
        }

        return maxLength;
        
    }
	/**
	 * 时间复杂度0(n*log2n)
	 * 空间复杂度O(n);
	 * @param nums
	 * @return
	 */
	public static int lengthOfLIS1(int[] nums){
		if(nums.length==0){
			return 0;
		}
		//dp[i]就表示长度为i+1的的上升子序列的最后一个元素的最小取值
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		int size=1;  //模拟栈
		for(int i=1;i<nums.length;i++){
			if(nums[i]>dp[size-1]){
				dp[size]=nums[i];
				size++;
			}else{
				//用二分法找出这个栈里面大于nums[i]的最小元素，并替换成nums[i]
				int left=0;
				int right=size-1;
				int mid;
				while(left<right){
					mid=(left+right)/2;
					if(nums[i]>dp[mid]){
						left=mid+1;
					}else{
						right=mid;
					}
				}
				dp[left]=nums[i];
			}
		}
		return size;
		
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLIS1(new int[]{4,10,4,3,8,9}));
	}
}
