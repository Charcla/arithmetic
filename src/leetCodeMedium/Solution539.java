package leetCodeMedium;

import java.util.List;

/**
 * @author Charcl
 * @date 2019/9/4 17:00
 */
public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] bucket=new boolean[24*60];
        for(String time:timePoints){
            int h=Integer.valueOf(time.split(":")[0]);
            int m=Integer.valueOf(time.split(":")[1]);
            if(bucket[h*60+m]){ //已经有这个元素了
                return 0;
            }
            bucket[h*60+m]=true;
        }
        int prev=0,min=Integer.MAX_VALUE;
        int first=Integer.MAX_VALUE,last=Integer.MIN_VALUE;
        for(int i=0;i<24*60;i++){
            if(bucket[i]){
                if(first!=Integer.MAX_VALUE){
                    min=Math.min(min,i-prev);
                }
                first=Math.min(first,i);
                last=Math.max(last,i);
                prev=i;
            }
        }
        min = Math.min(min, (24 * 60 - last + first));
        return min;
    }
}
