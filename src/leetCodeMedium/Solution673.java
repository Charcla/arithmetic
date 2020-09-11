package leetCodeMedium;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by skyou on 2019/5/21.
 */
public class Solution673 {

    public static int findNumberOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
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
        for(int n:dp){
            if(n==maxLength)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] n={1,3,5,4,7};
        System.out.println(findNumberOfLIS(n));
    }
}
