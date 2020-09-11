package leetCodeMedium;

/**
 * Created by skyou on 2019/5/27.
 */
public class Solution81 {
    public static boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int num = nums[mid];
            // If nums[mid] and target are "on the same side" of nums[0], we just take nums[mid].
            if ((nums[mid] < nums[0]) == (target < nums[0])) {
                num = nums[mid];
            } else {
                num = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            if (num < target)
                lo = mid + 1;
            else if (num > target)
                hi = mid - 1;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,3,1,1,1};
        search(nums,3);
    }
}
