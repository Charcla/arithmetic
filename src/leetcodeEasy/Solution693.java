package leetcodeEasy;

/**
 * Created by skyou on 2019/6/5.
 */
public class Solution693{
    public boolean hasAlternatingBits(int n) {
        int temp=n^(n>>1);
        return (temp&(temp+1))==0;
    }
}
