package leetcodeEasy;

/**
 * Created by skyou on 2019/5/21.
 */
public class Solution674 {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }else {
                dp[i]=1;
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
