package swordOffer;

public class test12 {
	
	public static double Power(double base,int exponent){
		double b=base;
		if(exponent==0){
			return 1;
		}
		for(int i=1;i<Math.abs(exponent);i++){
			base=base*b;
		}
		return exponent>0?base:1/base;
	}
	
	public static void main(String[] args) {
		System.out.println(Power(2,-3));
	}

}
