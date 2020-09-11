package classic.sort;

import java.util.Arrays;

public class TopK_quickSort {
	public static int[] quickSort(int[] arr,int k){
		if(arr==null)
			return null;
		if(arr.length<2){
			return arr;
		}
		return quickSort(arr, 0,arr.length-1,k);
	}

	private static int[] quickSort(int[] arr, int l, int r,int k) {
		if(l<r){
			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			int[] p=partition(arr,l,r); 	
			if(k<(arr.length-p[1])){
				return quickSort(arr, p[1]+1, r,k);
			}else if(k>(arr.length-p[0])){//在左边分区
				return quickSort(arr,l,r,k);
			}else{
				return quickSort(arr,arr.length-k,r);
			}
		}
		return arr;
	}
	
	private static int[] quickSort(int[] arr, int l, int r) {
		if(l<r){
			//随机快排，避免快排退化成n²
//			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			//优化过，如果选定的数有好几个，那么这些就全部确定
			int[] p=partition(arr,l,r);
			quickSort(arr, l, p[0]-1);
			quickSort(arr, p[1]+1, r);
		}
		int[] res=new int[r-l+1];
		int n=arr.length-1;
		for(int i=0;i<res.length;i++){
			res[i]=arr[n--];
		}
		return res;
	}
	
	private static int[] partition(int[] arr, int l, int r) {
		int less=l-1,more=r;
		while(l<more){
			if(arr[l]<arr[r]){
				swap(arr,++less,l++);
			}else if(arr[l]>arr[r]){
				swap(arr,--more,l);
			}else
				l++;
		}
		swap(arr,more,r);
		return new int[]{less+1,more};
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr={2,1,7,1,1,3,2,1,2,1,10};
		int[] res=quickSort(arr,8);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
