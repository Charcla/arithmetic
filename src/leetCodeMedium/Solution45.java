package leetCodeMedium;

public class Solution45 {
	public int jump(int[] nums) {
		if(nums.length<2){
			return 0;
		}
		int curMaxIndex=nums[0];
		int preMaxIndex=nums[0];
		int jumpCount=1;
		for(int i=1;i<nums.length;i++){
			if(i>curMaxIndex){
				curMaxIndex=preMaxIndex;
				jumpCount++;
			}
			if(preMaxIndex<nums[i]+i){
				preMaxIndex=nums[i]+i;
			}
		}
		
		return jumpCount;
    }
}
