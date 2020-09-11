package leetcode;


/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
         你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
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
