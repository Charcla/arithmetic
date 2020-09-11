package leetcodeEasy;

/**
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * @author skyou
 *
 */
public class Solution9 {
	//ʱ�临�Ӷ�O(log10(n))
		//�ռ临�Ӷ�O(1)
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
