package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skyou on 2019/6/6.
 */
public class Solution888 {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0,sumB=0;
        Map<Integer,Integer> mapB=new HashMap<>();
        int[] res=new int[2];
        for(int n:A){
            sumA+=n;
        }
        for(int n:B){
            mapB.put(n,1);
            sumB+=n;
        }
        int diff=(sumA-sumB)/2;
        for(int n:A){
            if(mapB.containsKey(n+diff)){
                res[0]=n;
                res[1]=n+diff;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={1,1};
        int[] b={2,2};
        fairCandySwap(a,b);
    }
}
