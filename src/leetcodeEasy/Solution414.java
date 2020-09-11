package leetcodeEasy;

public class Solution414 {
	public static int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE;
        long secondMax=Long.MIN_VALUE;
        long thirdMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>firstMax){
        		thirdMax=secondMax;
        		secondMax=firstMax;
        		firstMax=nums[i];
        	}else if(nums[i]>secondMax&&nums[i]<firstMax){
        		thirdMax=secondMax;
        		secondMax=nums[i];
        	}else if(nums[i]>thirdMax&&nums[i]<secondMax){
        		thirdMax=nums[i];
        	}
        }
        return (int) ((thirdMax==Long.MIN_VALUE||thirdMax==secondMax)?firstMax:thirdMax);
    }
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{1,2,Integer.MIN_VALUE}));
	}
}
