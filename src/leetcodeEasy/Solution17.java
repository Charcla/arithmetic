package leetcodeEasy;

public class Solution17 {
	public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int[] result=new int[2];
        while(left<right){
        	if((numbers[left]+numbers[right])==target){
        		result[0]=left+1;
        		result[1]=right+1;
        		return result;
        	}else if((numbers[left]+numbers[right])>target){
        		right--;
        	}else{
        		left++;
        	}
        }
        return result;
    }
}
