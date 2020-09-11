package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Charcl
 * @date 2019/8/30 9:43
 */
public class Solution424 {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        //记录出现次数最多的字符
        int maxCharCount=0;
        int left=0,right=0;
        int uniqueCount=0;
        while (right<s.length()){
            char c=s.charAt(right);
            uniqueCount=Math.max(uniqueCount,++hash[c-'A']);
            int replaceCount=right-left+1-uniqueCount;
            if(replaceCount>k){
                hash[s.charAt(left++)-'A']--;
            }else {
                maxCharCount=Math.max(maxCharCount,right-left+1);
            }
            right++;
        }
        return maxCharCount;
    }
}
