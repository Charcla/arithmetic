package leetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Charcl
 * @date 2019/8/27 20:24
 */
public class Solution438 {
    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        int left=0;
        int right= -1;

        int[] freq_s=new int[26];
        int[] freq_p=new int[26];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            freq_p[p.charAt(i)-'a']++;
            freq_s[s.charAt(++right)-'a']++;
        }
        if(Arrays.equals(freq_p,freq_s)){
            res.add(left);
        }
        //固定长度的滑动窗口
        while(right<s.length()-1){
            freq_s[s.charAt(++right)-'a']++;
            freq_s[s.charAt(left++)-'a']--;
            if(Arrays.equals(freq_p,freq_s)){
                res.add(left);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }
}
