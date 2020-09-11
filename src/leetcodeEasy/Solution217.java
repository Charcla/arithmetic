package leetcodeEasy;

public class Solution217 {
	public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0||nums.length==1){
        	return false;
        }
        mergeSort(nums, 0, 1);
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[i-1]){
        		return true;
        	}
        }
        return false;
    }
	
	private static void merge(int[] a, int s, int m, int t) {
        int[] tmp = new int[t - s + 1];
        int i = s, j = m, k = 0;
        while (i < m && j <= t) {
            if (a[i] <= a[j]) {
                tmp[k] = a[i];
                k++;
                i++;
            } else {
                tmp[k] = a[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            tmp[k] = a[i];
            i++;
            k++;
        }
        while (j <= t) {
            tmp[k] = a[j];
            j++;
            k++;
        }
        System.arraycopy(tmp, 0, a, s, tmp.length);
    }
	
	public static void mergeSort(int[] a, int s, int len) {
        int size = a.length;
        int mid = size / (len << 1);
        int c = size & ((len << 1) - 1);
        //��-------�鲢��ֻʣһ�����򼯺ϵ�ʱ������㷨-------//
        if (mid == 0)
            return;
        //��------����һ�˹鲢����-------//
        for (int i = 0; i < mid; ++i) {
            s = i * 2 * len;
            merge(a, s, s + len, (len << 1) + s - 1);
        }
        //��-------��ʣ�µ����͵���һ�����򼯺Ϲ鲢-------//
        if (c != 0)
            merge(a, size - c - 2 * len, size - c, size - 1);
        //��-------�ݹ�ִ����һ�˹鲢����------//
        mergeSort(a, 0, 2 * len);
    }
	
	public static void main(String[] args) {
		int[] nums={1,2,3,1};
		containsDuplicate(nums);
	}

}
