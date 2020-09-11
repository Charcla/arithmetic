package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyou on 2019/5/31.
 */
public class Solution942 {
    public static int[] diStringMatch(String S) {
        int N=S.length();
        int lo=0,hi=N;
        int[] res=new int[N+1];
        for(int i=0;i<S.length();i++){
            res[i]=S.charAt(i)=='I'?lo++:hi--;
        }
        res[N]=lo;
        return res;
    }

    public static void main(String[] args) {
        String s="IDID";
        diStringMatch(s);
        List<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        list.forEach(e-> System.out.println(e));
    }
}
