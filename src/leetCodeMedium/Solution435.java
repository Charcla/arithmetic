package leetCodeMedium;

import java.util.Arrays;


//̰��
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
        //��ɾ�����ٵ�Ԫ�ؾ�����������Ԫ��,̰�ģ�res=1��ʾ��һ���϶�����
        int res=1,pre=0;
        for(int i=1;i<intervals.length;i++){
        	if(intervals[i].start>=intervals[pre].end){
        		res++;
        		pre=i;
        	}
        }
        return intervals.length-res;
        
        //��̬�滮
    }
	public static void main(String[] args) {
		
	}
}
