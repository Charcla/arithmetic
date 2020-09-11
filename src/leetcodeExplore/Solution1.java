package leetcodeExplore;

public class Solution1 {
	public static void sortColors(int[] nums) {
        int less=-1,more=nums.length;
        int cur=0;
        while(cur<more){
        	if(nums[cur]>1){
        		swap(nums,cur,--more);
        	}else if(nums[cur]<1){
        		swap(nums,++less,cur++);
        	}else
        		cur++;
        }
    }
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] a={2,0,2,1,1,0};
		sortColors(a);
		for(int i:a){
			System.out.println(i);
		}
	}
}
