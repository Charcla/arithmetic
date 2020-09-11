package leetcodeEasy;

public class Solution849 {
	public int maxDistToClosest(int[] seats) {
        int max=0,left=-1,right=-1;
        for(int i=0;i<seats.length;i++){
        	if(seats[i]==0){
        		continue;
        	}
        	if(right==-1){
        		left=i;
        		right=i;
        	}else{
        		max=Math.max(max, (i-right)/2);
        		right=i;
        	}
        }
        return Math.max(left, Math.max(max, seats.length-1-right));
        
    }
}
