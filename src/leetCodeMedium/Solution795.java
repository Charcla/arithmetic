package leetCodeMedium;

/**
 * Created by skyou on 2019/5/30.
 */
public class Solution795 {

    //最大元素满足大于等于L 小于等于R的子数组个数=最大元素<=R的元素个数-最大元素<L的元素个数
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return numSubarrayBoundedMax(A,R)-numSubarrayBoundedMax(A,L-1);
    }

    private int numSubarrayBoundedMax(int[] A,int max){
        int res=0;
        int numSubarry=0;
        for(int num:A){
            if(num<=max){
                numSubarry++;
                res+=numSubarry;
            }else
                numSubarry=0;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution795 s=new Solution795();
        int[] i={2,1,4,3};
        s.numSubarrayBoundedMax(i,2,3);
    }

}
