package swordOffer;


/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author skyou
 *
 */
public class test13 {

	public static void reOrderArray(int [] array) {
		int n=array.length;
        int[] a=new int[n];
        int i=0,j=n-1;
        int c=i,d=j;
        while(i<=n&&j>=0){
        	if(array[i]%2==1){
        		a[c]=array[i];
        		c++;
        	}
        	if(array[j]%2==0){
        		a[d]=array[j];
        		d--;
        	}
        	i++;
        	j--;
        }
        System.arraycopy(a, 0, array, 0, n);
        for(int k=0;k<n;k++){
        	System.out.println(array[k]);
        }
    }
	
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7};
		reOrderArray(array);
	}
}
