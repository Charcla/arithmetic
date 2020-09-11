package leetCodeMedium;

/**
 * Created by skyou on 2019/5/24.
 */
public class Solution50 {

    public static double myPow(double x, int n) {
        double res = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) res *= x;
            x *= x;
        }
        return n < 0 ? 1 / res : res;
//        double sum=1;
//        double temp=x;
//        boolean flag=n>0?true:false;
//        n=Math.abs(n);
//        if(x==1){
//            return x;
//        }
//        while (n!=0){
//            if((n&1)==1){
//                sum*=temp;
//            }
//            temp*=temp;
//            n=n>>1;
//        }
//        return flag?sum:1/sum;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2));;
        double a=1.0000;
        System.out.println(a==1);
    }
}
