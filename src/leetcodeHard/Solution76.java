package leetcodeHard;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Charcl
 * @date 2019/8/29 10:01
 */
public class Solution76 {
    public static String minWindow(String s, String t) {
        int start=0,minLen=Integer.MAX_VALUE;
        int left=0,right=0;

        //d\定义两个计数器
        Map<Character,Integer> window=new HashMap<>();//窗口中字符出现次数
        Map<Character,Integer> needs=new HashMap<>();//t中字符出现次数
        for(char c:t.toCharArray()){
            needs.put(c,needs.getOrDefault(c,0)+1);
        }
        //记录window中有多少符合要求
        int match=0;

        while(right<s.length()){
            char c1=s.charAt(right);
            if(needs.containsKey(c1)){
                window.put(c1,window.getOrDefault(c1,0)+1);
                if(needs.get(c1).equals(window.get(c1))){
                    match++;
                }
            }
            right++;
            while(match==needs.size()){
                if(right-left<minLen){
                    //更新最小子串的位置和长度
                    start=left;
                    minLen=right-left;
                }
                char c2=s.charAt(left);
                if(needs.containsKey(c2)){
                    window.put(c2,window.getOrDefault(c2,1)-1);
                    if(window.get(c2)<needs.get(c2)){
                        match--;
                    }
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
