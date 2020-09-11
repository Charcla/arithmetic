package leetCodeMedium;

public class Solution215 {
	public static int findKthLargest(int[] nums, int k) {
		if(nums==null)
			return 0;
		if(nums.length<2){
			return nums[0];
		}
		return quickSort(nums,0,nums.length-1,k);
    }

	private static int quickSort(int[] nums, int l, int r,int k) {
		if(l<r){
			//随机快排，尽量避免退化为n²复杂度。
			swap(nums, l + (int) (Math.random() * (r - l + 1)), r);
			int[] p=partition(nums,l,r);
			if(k<(nums.length-1-p[1]+1)){//要求的数在右边分区，不用左右两边分区都递归，只要递归一边就行
				return quickSort(nums, p[1]+1,nums.length-1,k);
			}else if(k>(nums.length-1-p[0]+1)){//在左边分区
				return quickSort(nums,l,p[0]-1,k);
			}else{ //已经找到
				return nums[p[0]];
			}
		}
		return nums[l];
	}

	private static int[] partition(int[] nums,int l,int r) {
		int less=l-1;
		int more=r;
		while(l<more){
			if(nums[l]<nums[r]){
				swap(nums,++less,l++);
			}else if(nums[l]>nums[r]){
				swap(nums,--more,l);
			}else{
				l++;
			}
		}	
		swap(nums,more,r);
		return new int[]{less+1,more};
	}

	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr={3,2,1,5,6,4};
		System.out.println(findKthLargest(arr,2));;
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
	}
}
