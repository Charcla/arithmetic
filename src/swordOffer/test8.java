package swordOffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 *
 * @author skyou
 *
 */
public class test8 {
	
	public static int JumpFloor(int target) {
		//递归效率太慢
//		if(target<=0){
//			return -1;
//		}else if(target==1||target==2){
//			return target;
//		}else{
//			return JumpFloor(target-1)+JumpFloor(target-2);
//		}
		int a=1,b=2,c=3;
		if(target<=0){
			return -1;
		}else if(target==1||target==2){
			return target;
		}else{
			for(int i=3;i<=target;i++){
				c=a+b;
				a=b;
				b=c;
			}
			return c;
		}
    }
	
	public static void main(String[] args) {
		
		System.out.println(JumpFloor(3));
	}

}
