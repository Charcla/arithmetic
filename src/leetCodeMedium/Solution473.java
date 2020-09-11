package leetCodeMedium;


public class Solution473 {
	public static boolean makesquare(int[] nums) {
        if(nums.length<4){
        	return false;
        }
		int sum=0;
		for(int i:nums){
        	sum+=i;
        }
		int standardSide=sum/4;
		int[] side=new int[4];
		int i=0;
		for(int n:nums){
			side[i]+=n;
			if(side[i]==standardSide)
				i++;
		}
		for(int j=1;j<side.length;j++)
			if(side[j]!=side[j-1])
				return false;
		return true;
    }
	public static void main(String[] args) {
		int[] nums={5,5,5,5,4,4,4,4,3,3,3,3};
		System.out.println(makesquare(nums));
	}
}
