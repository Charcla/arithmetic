package leetCodeMedium;

import java.util.Arrays;

/**
 * Created by skyou on 2019/6/6.
 */
public class Solution324 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            res[lo]=nums[lo++];
            res[hi]=nums[hi--];
        }
    }
}
