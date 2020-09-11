package leetCodeMedium;

public class Solution452 {
	public int findMinArrowShots(int[][] points) {
		if(points.length<1){
			return 0;
		}
		
        int shoot_begin=points[0][0];
        int shoot_end=points[0][1];
        int shoot_man=1;
        for(int i=1;i<points.length;i++){
        	if(points[i][0]<=shoot_end){
        		
        		shoot_begin=points[i][0];
        		if(points[i][1]<shoot_end){
        			shoot_end=points[i][1];
        		}
        	}else{
        		shoot_man++;
        		shoot_begin=points[i][0];
        		shoot_end=points[i][1];
        	}
        }
        return shoot_man;
    }
}
