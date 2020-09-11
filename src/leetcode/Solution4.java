package leetcode;

/**
 * ����������СΪ m �� n ���������� nums1 �� nums2��

�����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��

����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�
 * @author skyou
 *
 */
public class Solution4 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
        if (m < n) return findMedianSortedArrays(nums2, nums1);
        if (n == 0) return (nums1[(m - 1) / 2] + nums1[m / 2]) / 2.0;
        int left = 0, right = 2 * n;//�������Ϊ2n+1������ż����������Ϊ2n+1-1;
        while (left <= right) {//����
            int mid2 = (left + right) / 2;
            int mid1 = m + n - mid2;
            //L1��һ�������ʾ�и����߲��ֵ����ֵ��R1��ʾ�ұ߲��ֵ���Сֵ
            double L1 = mid1 == 0 ? Double.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double L2 = mid2 == 0 ? Double.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = mid1 == m * 2 ? Double.MAX_VALUE : nums1[mid1 / 2];
            double R2 = mid2 == n * 2 ? Double.MAX_VALUE : nums2[mid2 / 2];
            if (L1 > R2) left = mid2 + 1;
            else if (L2 > R1) right = mid2 - 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;
        
    }
	
	public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
		int m=nums1.length;
		int n=nums2.length;
		if(m<n){
			return findMedianSortedArrays1(nums2, nums1);
		}
		if(n==0){
			return (nums1[(m-1)/2]+nums1[m/2])/2.0;
		}
	    int left=0;int right=2*n;
	    while(left<=right){
	    	int mid2=(left+right)/2;
	    	int mid1=n+m-mid2;
	    	double l1=mid1==0?Double.MIN_VALUE:nums1[(mid1-1)/2];
	    	double l2=mid2==0?Double.MIN_VALUE:nums2[(mid2-1)/2];
	    	double r1=mid1==m*2?Double.MAX_VALUE:nums1[mid1/2];
	    	double r2=mid2==n*2?Double.MAX_VALUE:nums2[mid2/2];
	    	if(l1>r2){
	    		left=mid2+1;
	    	}else if(l2>r1){
	    		right=mid2-1;
	    	}else
	    		return(Math.max(l1, l2)+Math.min(r1, r2))/2;
	    }
	    return -1;
    }
	
	public static void main(String[] args) {
		int[] nums1={2,3,4};
		int[] nums2={1};
		System.out.println(findMedianSortedArrays1(nums1,nums2));
	}
}
