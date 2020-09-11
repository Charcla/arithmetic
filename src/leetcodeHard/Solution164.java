package leetcodeHard;

public class Solution164 {
	public static int maximumGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int length=nums.length;
		//维护每个桶的最大最小值
		int[] maxs=new int[length+1];
		int[] mins=new int[length+1];
		//判断桶是否空
		boolean[] hasNum=new boolean[length+1];
		for(int i=0;i<length;i++){
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		if(max==min)
			return 0;
		for(int i=0;i<length;i++){
			int position=bucket(nums[i],length,min,max);
			maxs[position]=hasNum[position]?Math.max(maxs[position],nums[i]):nums[i];
			mins[position]=hasNum[position]?Math.min(mins[position],nums[i]):nums[i];
			hasNum[position]=true;
		}
		int res=0,lastMax=maxs[0];
		for(int i=1;i<=length;i++){
			if(hasNum[i]){
				res=Math.max(res,mins[i]-lastMax);
				lastMax=maxs[i];
			}
		}
		return res;
		
    }
	//计算应该放入哪个桶
	private static int bucket(long num, long length, int min, int max) {
		return (int) ((int)(num-min)*length/(max-min));
	}
	public static void main(String[] args) {
		System.out.println(maximumGap(new int[]{1,10000000}));
	}
}
