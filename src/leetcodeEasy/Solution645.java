package leetcodeEasy;

/**
 * @author Charcl
 * @date 2019/8/12 20:08
 */
public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] res=new int[2];
        if(nums==null||nums.length==0){
            return null;
        }
        int[] hash=new int[nums.length+1];
        for (int n:nums){
            hash[n]++;
        }
        for (int i=1;i<hash.length;i++){
            if(hash[i]==0){
                res[1]=i;
            }
            if(hash[i]==2){
                res[0]=i;
            }
        }
        return res;
    }
}
