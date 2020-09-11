package classic.sort;

public class Solution704 {

    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }

        int lo=0,hi=nums.length-1,mid=0;
        while(lo<hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]>target){
                hi=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
