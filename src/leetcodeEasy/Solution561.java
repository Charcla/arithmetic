package leetcodeEasy;

/**
 * Created by skyou on 2019/6/14.
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        int[] hash=new int[20001];
        for(int n:nums){
            hash[n+10000]++;
        }
        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if (odd) {
                    sum += i - 10000;
                }
                odd = !odd;
                hash[i]--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] n={1,1,2,2,3,4};
        new Solution561().arrayPairSum(n);
    }
}
