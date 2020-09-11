package leetcode;


/**
 * �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣
 * ��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
         ����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
 * @author skyou
 *
 */
public class Solution88 {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res=new int[m+n];
       int i=0,j=0,k=0;
       while(i<m&&j<n){
    	   if(nums1[i]<=nums2[j]){
    		   res[k++]=nums1[i];
    		   i++;
    		   if(i==m){
        		   for(;j<n;j++){
        			   res[k++]=nums2[j];        			   
        		   }
        	   }
    	   }else{
    		   res[k++]=nums2[j];
    		   j++;
    		   if(j==n){
        		   for(;i<m;i++){
        			   res[k++]=nums1[i];
        		   }
        	   }
    	   }
    	   
    	   
       }
       nums1=new int[m+n];
       for(int c=0;c<res.length;c++){
    	   nums1[c]=res[c];
       }
    }
	public static void main(String[] args) {
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		merge(nums1, 3, nums2, 3);
	}
}
