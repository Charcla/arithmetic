package leetcodeEasy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @author skyou
 *
 */
public class Solution14 {
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0){
			return "";
		}
		StringBuilder sb=new StringBuilder();
		boolean b=true;
        for(int i=0;i<strs[0].length();i++){
        	char s=strs[0].charAt(i);
        	for(int j=1;j<strs.length;j++){
        		if(j==strs[j].length()||s!=strs[j].charAt(i)){
        			return sb.toString();
        		}
        	}
        	sb.append(s);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		String[] strs={"aaa","aa","aaa"};
		System.out.println(longestCommonPrefix(strs));
	}
}
