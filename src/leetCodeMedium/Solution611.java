package leetCodeMedium;

import java.util.Arrays;

public class Solution611 {
	public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        if(len<=2){
        	return 0;
        }
        int i=0,j=1,k=len-1,sum=0;
        while(i+2<len){
        	while(j+1<len){
        		while(k>j){
        			if(nums[i]+nums[j]>nums[k]){
        				sum+=k-j;
        				k=len-1;
        				break;
        			}
        			k--;
        		}
        		j++;
        	}  
        	i++;
        	j=i+1;
        }
        return sum;
    }
	public static void main(String[] args) {
		int[] s={0,1,1,1};
		int a=triangleNumber(s);
	}
}
