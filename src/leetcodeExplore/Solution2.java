package leetcodeExplore;

public class Solution2 {
	public static int minSubArrayLen(int s, int[] nums) {
		//»¬¶¯´°¿Ú
		int left=0,right=-1;
		int len=nums.length+1;
		int res=0;
		while(left<nums.length){
			if(res<s&&right<nums.length-1){
				right++;
				res+=nums[right];
			}else{
				res-=nums[left];
				left++;
			}
			if(res>=s)
				len=Math.min(len, right-left+1);
		}
		if(len==nums.length+1){
			return 0;
		}
		return len;
    }
	public static void main(String[] args) {
		int[] a={2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, a));
	}
}
