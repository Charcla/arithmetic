package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyou on 2019/5/25.
 */
public class Solution228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        if(nums.length==1){
            res.add(nums[0]+"");
            return res;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
                i++;
            }
            if(a!=nums[i]){
                res.add(a+"->"+nums[i]);
            }else{
                res.add(a+"");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={0,2,3,4,6,8,9};
        System.out.println(summaryRanges(a));;
    }
}
