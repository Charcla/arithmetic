package leetCodeMedium;

public class Solution926 {
	public static int minFlipsMonoIncr(String S) {
//		int n=S.length();
//		int cnt0=0; //��1��Ϊ0������
//		int cnt1=0; //0��Ϊ1�µĴ���
//		for(int i=0;i<n;i++){
//			if(S.charAt(i)=='0'){
//				cnt1=Math.min(cnt0, cnt1)+1;
//			}else{
//				cnt0++;
//				cnt1=Math.min(cnt0-1, cnt1);
//			}
//		}
//		return Math.min(cnt0, cnt1);
		int f0 = 0, f1 = 0;
        for (int i = 0; i < S.length(); ++i) {
            int n=S.charAt(i) - '0';
            f0 +=n;
            f1 = Math.min(f0, f1 + 1 -n);
        }
        return f1;  
    }
	public static void main(String[] args) {
		System.out.println(minFlipsMonoIncr("010110"));
	}
}
