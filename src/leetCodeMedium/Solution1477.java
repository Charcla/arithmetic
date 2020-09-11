package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution1477 {

    public int minSumOfLengths(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();//key为数组arr[0]到arr[value]的累加和
        map.put(0,-1);//放入初始值
        int sum=0;
        int lsize=Integer.MAX_VALUE;//左边那个子数组的长度
        int result=Integer.MAX_VALUE;//结果
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            map.put(sum,i);
        }
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.get(sum-target)!=null){//说明数组在i的左边有个子集的和为target
                lsize=Math.min(lsize,i-map.get(sum-target));
            }
            //说明数组在i的右边存在一个子集的和为target
            if(map.get(sum+target)!=null&&lsize<Integer.MAX_VALUE){
                result=Math.min(result,map.get(sum+target)-i+lsize);
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }

    public static void main(String[] args) {


    }
}
