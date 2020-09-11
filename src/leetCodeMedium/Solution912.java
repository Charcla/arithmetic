package leetCodeMedium;

public class Solution912 {
	public int[] sortArray(int[] nums) {
        int[] hash=new int[50000*2+1];
        for(int n:nums){
        	hash[n+50000]++;
        }
        int position=0;
        for(int i=0;i<hash.length;i++){
        	for(int j=0;j<hash[i];j++){
        		nums[position++]=i-50000;
        	}
        }
        return nums;
    }
}
