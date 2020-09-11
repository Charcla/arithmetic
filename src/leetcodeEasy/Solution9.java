package leetcodeEasy;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author skyou
 *
 */
public class Solution9 {
	//时间复杂度O(log10(n))
		//空间复杂度O(1)
	public boolean isPalindrome(int x) {
		
		if(x<0 || (x%10==0&&x!=0)){
			return false;
		}
		
		int rev=0;
		while(x>rev){
			int n=x%10;
			rev=rev*10+n;
			x=x/10;
		}
		
		return rev==x ||x==rev/10;
        
    }
}
