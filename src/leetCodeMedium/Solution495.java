package leetCodeMedium;

/**
 * @author Charcl
 * @date 2019/8/8 20:25
 */
public class Solution495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int time=0;
        if(timeSeries==null||timeSeries.length==0){
            return time;
        }
        for(int i=0;i<timeSeries.length-1;i++){
            time+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        return time+duration;
    }

    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println(findPoisonedDuration(a,2));
    }
}
