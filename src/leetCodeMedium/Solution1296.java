package leetCodeMedium;

/**
 * @author Charcl
 * @date 2020/4/3 15:15
 */
public class Solution1296 {

    public static boolean isPossibleDivide(int[] nums, int k) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int n[]=new int[max+1];
        for(int i:nums){
            n[i]++;
        }
        int i=1;
        for(;i<=n.length-k;i++){
            while(n[i]>0){
                for(int j=1;j<k;j++){
                    if(n[i+j]==0){
                        return false;
                    }else{
                        n[i+j]--;
                    }
                }
                n[i]--;
            }
        }
        for(int z=i;z<n.length;z++){
            if(n[z]>0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(Solution1296.isPossibleDivide(a,3));;
    }

}

