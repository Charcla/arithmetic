package leetCodeMedium;

/**
 * Created by skyou on 2019/5/27.
 */
public class Solution33 {
    public static int search(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            //第一个三元为了判断mid是不是和target在同一端
            double num=(nums[mid] < nums[0]) == (target < nums[0])
                    ? nums[mid]
                    //如果mid和target不在同一端，那就用最大值，最小值来填充数组
                    //min代表最小值，max代表最大值
                    //比如说，对于数组[4,5,6,7,0,1,2],如果目标是0，那么可以把数组理想成{min,min,min,min,0,1,2};
                    : target < nums[0] ? Integer.MIN_VALUE: Integer.MAX_VALUE;
            if(num<target)
                lo=mid+1;
            else if(num>target)
                hi=mid-1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        search(nums,0);
    }
}
