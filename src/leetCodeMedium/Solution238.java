package leetCodeMedium;

public class Solution238 {
	public static int[] productExceptSelf(int[] nums) {
        //res存放nums[i]的左边所有元素的乘积和
		int[] res=new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
        	res[i]=res[i-1]*nums[i-1];
        }
        //第二次遍历从右边开始，用buffer缓存右边的元素乘积
        int buffer=nums[res.length-1];
        for(int i=nums.length-2;i>=0;i--){
        	res[i]=res[i]*buffer;
        	buffer=buffer*nums[i];
        }
        return res;
    }
	public static void main(String[] args) {
		int[] nums={1,2,3,4};
		productExceptSelf(nums);
	}
}
