package swordOffer;

public class test7 {

	/**
	 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
	 n<=39

	 用非递归法
	 */


	public static int Fibonacci(int n) {
		int a=0,b=1,c=1;
		if(n==0){
			return 0;
		}else if(n==1||n==2){
			return 1;
		}else{
			for(int i=3;i<=n;i++){
				a=b+c;
				b=c;
				c=a;
				
			}
			return a;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(6));
	}

}
