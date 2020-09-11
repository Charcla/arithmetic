package leetCodeMedium;

public class Solution1437 {

    public boolean kLengthApart(int[] nums, int k) {
        int pos=-1000000;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(i-pos+1<k){
                    return false;
                }
                pos=i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1437 s=new Solution1437();
        int[] a={0,1,0,1};
        s.kLengthApart(a,2);
    }
}
