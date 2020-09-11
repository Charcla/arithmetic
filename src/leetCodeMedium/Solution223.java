package leetCodeMedium;

/**
 * @author Charcl
 * @date 2019/7/29 20:25
 */
public class Solution223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        //重叠部分面积
        int s=0;
        if(E>=C||B>=H||A>=G||F>=D){
            s=0;
        }else{
            int x1=Math.max(A,E);
            int y1=Math.max(B,F);
            int x2=Math.min(C, G);
            int y2 = Math.min(D, H);
            s=(x2-x1)*(y2-y1);
        }
        return (C-A)*(D-B)+(G-E)*(H-F)-s;

    }
}
