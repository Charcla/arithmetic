package leetcodeEasy;

/**
 * Created by skyou on 2019/5/23.
 */
public class Solution977 {
    public static int[] sortedSquares(int[] A) {
        int left=0,right=A.length-1;
        int[] res=new int[A.length];
        int p=A.length-1;
        while(left<=right){
            if(Math.abs(A[left])<Math.abs(A[right])){
                res[p--]= (int) Math.pow(A[right--],2);
            }else{
                res[p--]= (int) Math.pow(A[left++],2);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={-7,-3,2,3,11};
        sortedSquares(nums);
    }
}
