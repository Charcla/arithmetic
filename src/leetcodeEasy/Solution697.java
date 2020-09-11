package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 *
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/degree-of-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution697 {

    public int findShortestSubArray(int[] nums) {
        int ans=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        //存储值和值在数组最左边的位置
        Map<Integer,Integer> leftMap=new HashMap<>();
        //存储值和值在数组最右边的位置
        Map<Integer,Integer> rightmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
            if(leftMap.get(n)==null){
                leftMap.put(n,i);
            }
            rightmap.put(n,i);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            max=Math.max(max,entry.getValue());
        }

        for(int x:map.keySet()){
            if(map.get(x)==max){
                ans = Math.min(ans, rightmap.get(x) - leftMap.get(x) + 1);
            }
        }
        return ans;

    }
}
