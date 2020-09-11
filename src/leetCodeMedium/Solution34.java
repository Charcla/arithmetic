package leetCodeMedium;

/**
 * Created by skyou on 2019/6/1.
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        double left=target-0.5,right=target+0.5;
        int l=bs(nums,left),r=bs(nums,right);
        if(l==r){
            return new int[]{-1,-1};
        }
        return new int[]{l,r-1};
    }

    //找出大于target最小一位，返回数组索引
    private int bs(int[] nums,double target){
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target>nums[mid]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        new Solution34().searchRange(nums,8);
    }
}
