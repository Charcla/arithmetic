package classic.sort;

public class HeapSort {
	public static void sort(int[] arr){
		if (arr == null || arr.length < 2) {
			return;
		}
		//�ȴ����󶥶�
		for(int i=0;i<arr.length;i++){
			heapInsert(arr, i);
		}
		//����ȥ�ѶѶ�Ԫ�غʹ����һ��Ҷ�ӽڵ㿪ʼ�����������ѵ�ĩβ�ͱ�Ȼ�����Ԫ��
		int size=arr.length;
		swap(arr,0,--size);
		while(size>0){
			heapfiy(arr, 0, size);
			swap(arr,0,--size);
		}
		
	}

	private static void heapInsert(int[] arr, int index) {
		while(arr[index]>arr[(index-1)/2]){
			swap(arr,index,(index-1)/2);
			index=(index-1)/2;
		}
	}

	//������Ԫ�ط����仯���Ͷ�̬������size��ʾ����ѵĴ�С������size�Ĳ��־Ͳ��ù�
	public static void heapfiy(int[] arr,int index,int size){
		int left=index*2+1;
		while(left<size){
			int largest=left+1<size&&arr[left+1]>arr[left]?left+1:left;
			largest=arr[largest]>arr[index]?largest:index;
			if(largest==index){
				break;
			}
			swap(arr,largest,index);
			index=largest;
			left=index*2+1;
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr={3,2,1,5,6,4,0,9,0,5,3};
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
