package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Charcl
 * @date 2019/8/29 16:55
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
//        int maxLength=0,n=0;
//        int[] index=new int[128];
//        for(int i=0;i<s.length();i++){
//            n=Math.max(index[s.charAt(i)],n);
//            maxLength=Math.max(maxLength, i-n+1);
//            //表示左边界的位置，如果有重复，左边界直接移动到这里
//            index[s.charAt(i)]=i+1;
//        }
//        return maxLength;

        int left=0,right=0;
        Map<Character,Integer> window=new HashMap<>();
        int res=0;
        while (right<s.length()){
            char c1=s.charAt(right);
            window.put(c1,window.getOrDefault(c1,0)+1);
            right++;
            //如果window出现重复字符
            //开始移动left缩小窗口
            while (window.get(c1)>1){
                char c2=s.charAt(left);
                window.put(c2,window.getOrDefault(c2,1)-1);
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
