package classic.sort;

public class MergeSort {

	public static void mergeSort(int[] arr){
		if(arr.length<2||arr==null){
			return;
		}	
		mergeSort(arr,0,arr.length-1);
	}
	//将大数组分为两个
	private static void mergeSort(int[] arr, int l, int r) {
		if(l==r)
			return;
		int mid=l+((r-l)>>1);
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1,r);
		merge(arr,l,mid,r);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] help=new int[r-l+1];
		int i=0;
		int p1=l,p2=mid+1;
		while(p1<=mid&&p2<=r){
			help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
		}
		while(p1<=mid)
			help[i++]=arr[p1++];
		while(p2<=r)
			help[i++]=arr[p2++];
		for(i=0;i<help.length;i++){
			arr[l+i]=help[i];
		}
	}
	public static void main(String[] args) {
		int[] arr={5,2,4,1,8,3};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
