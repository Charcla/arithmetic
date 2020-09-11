package leetcode;
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author skyou
 *
 */
public class Solution3 {
	/**
	 * 用滑动窗口思想，如果 s[j]在[i,j)范围内有与 j'重复的字符，我们不需要逐渐增加 i。
	 * 我们可以直接跳过 [i，j']范围内的所有元素，并将 i变为 j'+1
	 * @param s
	 * @return
	 * 时间复杂度:O(n),索引i迭代n次
	 * 空间复杂度(Table):O(n)，需要创建一个大小n的数组，n取决于字符集
	 */
	public static int lengthOfLongestSubstring(String s) {
		int maxLength=0,n=0;//n为左边界
		int[] index=new int[128];
		for(int i=0;i<s.length();i++){
			n=Math.max(index[s.charAt(i)],n);
			maxLength=Math.max(maxLength, i-n+1);
			//表示左边界的位置，如果有重复，左边界直接移动到这里
			index[s.charAt(i)]=i+1;
		}
		return maxLength;
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}
}
