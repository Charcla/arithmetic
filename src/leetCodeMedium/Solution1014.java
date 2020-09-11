package leetCodeMedium;

public class Solution1014 {
	public static int maxScoreSightseeingPair(int[] A) {
		//res��ʾ�������cur��ʾ���ʹ���������߽�
		int res = 0, cur = 0;
        for (int a: A) {
            res = Math.max(res, cur + a);
            //��Ϊÿ��ѭ���������߽��뵱ǰλ�õľ��붼��+1
            cur = Math.max(cur, a) - 1;
        }
        return res;
		
    }
	public static void main(String[] args) {
		int[] a={7,4,6,9};
		System.out.println(maxScoreSightseeingPair(a));;
	}
}
