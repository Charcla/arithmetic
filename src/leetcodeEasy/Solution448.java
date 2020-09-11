package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    /**
     * 两趟遍历，第一趟给元素中的值对应的索引的值+数组长度
     * 这样第二趟来遍历的时候，只是元素值<=数组长度的索引就是答案
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            nums[(nums[i]-1)%length]+=length;
        }
        for(int i=0;i<length;i++){
            if(nums[i]<=length){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a={1,1};
        Solution448 s=new Solution448();
        s.findDisappearedNumbers(a);
    }
}
