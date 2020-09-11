package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by skyou on 2019/6/3.
 */
public class Solution962 {

    public int maxWidthRamp(int[] A) {
        List<Integer> list=new ArrayList<>();
        int res=0,n=A.length;
        for(int i=0;i<n;i++){
            if(list.size()==0||A[i]<A[list.get(list.size()-1)]){
                list.add(i);
            }else{
                int left=0,right=list.size()-1,mid=0;
                while(left<right){
                    mid=left+(right-left)/2;
                    if(A[list.get(mid)]>A[i]){
                        left=mid+1;
                    }else{
                        right=mid;
                    }
                }
                res = Math.max(res, i - list.get(left));
            }
        }
        return res;
    }

    public int maxWidthRamp2(int[] A) {
        Stack<Integer> s = new Stack<>();
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i)
            if (s.empty() || A[s.peek()] > A[i])
                s.add(i);
        for (int i = n - 1; i > res; --i)
            while (!s.empty() && A[s.peek()] <= A[i])
                res = Math.max(res, i - s.pop());
        return res;
    }

    public static void main(String[] args) {
        int[] a={6,0,8,2,1,5};
        System.out.println(new Solution962().maxWidthRamp(a));;
        System.out.println(new Solution962().maxWidthRamp2(a));;
    }
}
