package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Solution268 {
	public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int realSum=0;
        for(int i=0;i<=n;i++)
        	sum+=i;
        for(int i=0;i<nums.length;i++)
        	realSum+=i;
        return sum-realSum;
        
    }
}
