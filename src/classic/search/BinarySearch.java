package classic.search;

/**
 * 介绍三种二分搜索
 * @author Charcl
 * @date 2019/6/17 20:08
 */
public class BinarySearch {

    //最基本的二分搜索，搜索一个数，存在返回索引，不存在就返回-1
    public static int binarySearch(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int lo=0,hi=nums.length-1,mid=0;
        while(lo<=hi){
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

    //寻找左侧边界的二分搜索(或者说是数组中值小于target的个数)
    public static int binarySearchLeftBound(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int lo=0,hi=nums.length;//每次搜索区间是[),左闭右开
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }

    //寻找右边界(也就是查找数组中值大于target的个数)
    public static int binarySearchRightBound(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int lo=0,hi=nums.length;//每次搜索区间是[),左闭右开
        while (lo < hi) {
            int mid = lo + (hi-lo) / 2;
            if (nums[mid] > target) {
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return lo - 1; // 注意
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(binarySearchLeftBound(nums,7));
        System.out.println(binarySearchRightBound(nums,7));
    }
}
