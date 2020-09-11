package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Charcl
 * @date 2019/7/29 20:54
 */
public class Solution442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            if(nums[num-1]>0){
                nums[num-1]*=-1;
            }else {
                res.add(num);
            }
        }
        return res;
    }
}
