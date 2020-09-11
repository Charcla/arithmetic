package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/7/29 20:48
 */
public class Solution172 {
    public int trailingZeroes(int n) {
        int count=0;
        while (n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }
}
