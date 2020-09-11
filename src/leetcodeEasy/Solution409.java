package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/9/5 16:40
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        int[] count=new int[128];
        for(char c:s.toCharArray()){
            count[c]++;
        }
        int ans=0;
        for(int v:count){
            ans+=v/2*2;
            if(v%2==1&&ans%2==0){
                ans++;
            }
        }
        return ans;
    }
}
