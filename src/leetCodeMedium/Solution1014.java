package leetCodeMedium;

public class Solution1014 {
	public static int maxScoreSightseeingPair(int[] A) {
		//res表示最大结果，cur表示访问过的左边最大边界
		int res = 0, cur = 0;
        for (int a: A) {
            res = Math.max(res, cur + a);
            //因为每次循环，最大左边界离当前位置的距离都会+1
            cur = Math.max(cur, a) - 1;
        }
        return res;
		
    }
	public static void main(String[] args) {
		int[] a={7,4,6,9};
		System.out.println(maxScoreSightseeingPair(a));;
	}
}
