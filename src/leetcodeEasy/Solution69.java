package leetcodeEasy;

/**
 * Created by skyou on 2019/5/24.
 */
public class Solution69 {
    public static int mySqrt(int x) {
        if(x==0)
            return 0;
        long left=0;
        long right=x;
        long mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(mid*mid==x){
                return (int) mid;
            }else if(mid*mid<x){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        if(left*left<x)
            return (int) left;
        else
            return (int) (left-1);
    }

    public static void main(String[] args) {
        mySqrt(2147395599);
    }
}
