package leetcode;
/**
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 * @author skyou
 *
 */
public class Solution3 {
	/**
	 * �û�������˼�룬��� s[j]��[i,j)��Χ������ j'�ظ����ַ������ǲ���Ҫ������ i��
	 * ���ǿ���ֱ������ [i��j']��Χ�ڵ�����Ԫ�أ����� i��Ϊ j'+1
	 * @param s
	 * @return
	 * ʱ�临�Ӷ�:O(n),����i����n��
	 * �ռ临�Ӷ�(Table):O(n)����Ҫ����һ����Сn�����飬nȡ�����ַ���
	 */
	public static int lengthOfLongestSubstring(String s) {
		int maxLength=0,n=0;//nΪ��߽�
		int[] index=new int[128];
		for(int i=0;i<s.length();i++){
			n=Math.max(index[s.charAt(i)],n);
			maxLength=Math.max(maxLength, i-n+1);
			//��ʾ��߽��λ�ã�������ظ�����߽�ֱ���ƶ�������
			index[s.charAt(i)]=i+1;
		}
		return maxLength;
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}
}
