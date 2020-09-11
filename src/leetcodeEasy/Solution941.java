package leetcodeEasy;

public class Solution941 {
	public static boolean validMountainArray(int[] A) {
        int length=A.length;
        if(length<3){
        	return false;
        }
        int max=0;
        int i=0;
        boolean flag=true;
        for(i=0;i<length-1;i++){
        	if(flag&&A[i]<A[i+1])
        		max=A[i+1];
        	else{
        		flag=false;
        		if(A[i]<=A[i+1])
        			return false;
        	}
        		
        }
        if(i==length-1){
        	return false;
        }
        return true;
    }
	public static void main(String[] args) {
		int[] s={3,7,6,4,3,0,1,0};
		System.out.println(validMountainArray(s));
	}
}
