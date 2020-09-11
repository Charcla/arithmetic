package classic.sort;

public class QuickSort {
	public static void quickSort(int[] arr){
		if(arr==null||arr.length<2)
			return;
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int l, int r) {
		if(l<r){
			//随机快排，避免快排时间复杂度降低为n*n
			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			//优化过，如果选定的数有好几个，那么这些就全部确定
			int[] p=partition(arr,l,r);
			quickSort(arr, l, p[0]-1);
			quickSort(arr, p[1]+1, r);
		}
	}

	private static int[] partition(int[] arr, int l, int r) {
		int less=l-1;
		int more=r;
		while(l<more){
			if(arr[l]<arr[r]){
				swap(arr,++less,l++);
			}else if(arr[l]>arr[r]){
				swap(arr,--more,l);
			}else{
				l++;
			}
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
		int[] arr={1,4,3,2,5,9,3};
		quickSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}