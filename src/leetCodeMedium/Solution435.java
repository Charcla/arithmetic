package leetCodeMedium;

import java.util.Arrays;


//贪心
public class Solution435 {
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
            return 0;
        Arrays.sort(intervals,(a,b)->{
        	if(a.end!=b.end){
        		return a.end-b.end;
        	}
        	return a.start-b.start;
        });
        //求删除最少的元素就是求保留最多的元素,贪心，res=1表示第一个肯定保留
        int res=1,pre=0;
        for(int i=1;i<intervals.length;i++){
        	if(intervals[i].start>=intervals[pre].end){
        		res++;
        		pre=i;
        	}
        }
        return intervals.length-res;
        
        //动态规划
    }
	public static void main(String[] args) {
		
	}
}
