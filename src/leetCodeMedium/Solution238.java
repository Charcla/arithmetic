package leetCodeMedium;

public class Solution238 {
	public static int[] productExceptSelf(int[] nums) {
        //res���nums[i]���������Ԫ�صĳ˻���
		int[] res=new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
        	res[i]=res[i-1]*nums[i-1];
        }
        //�ڶ��α������ұ߿�ʼ����buffer�����ұߵ�Ԫ�س˻�
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
