package leetcodeEasy;

public class Solution367 {
	//1+3+5+7+...+n=��ȫƽ��
	public boolean isPerfectSquare(int num) {
		int sum=1;
		while(num>0){
			num-=sum;
			sum+=2;
		}
		return num==0;
    }
}
