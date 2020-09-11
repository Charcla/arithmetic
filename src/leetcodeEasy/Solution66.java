package leetcodeEasy;

import javax.swing.text.AbstractDocument.LeafElement;

public class Solution66 {
	public static int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length-1;
        int sum;
        while(carry==1){
        	sum=digits[n]+carry;
        	carry=sum>=10?1:0;
        	sum=sum%10;
        	digits[n]=sum;
        	n--;
        	if(n<0&&carry==1){
        		digits=resize(digits);
        		digits[0]=1;
        		break;
        	}
        	
        }
        return digits;
    }
	public static int[] resize(int[] num){
		int[] nums=new int[num.length+1];
		for(int i=num.length-1;i>=0;i--){
			int n=i+1;
			nums[n]=num[i];
		}
		return nums;
	}
	public static void main(String[] args) {
		System.out.println(plusOne(new int[]{0}));;
	}
}