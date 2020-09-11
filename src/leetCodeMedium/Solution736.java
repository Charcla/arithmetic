package leetCodeMedium;

import java.util.Stack;

public class Solution736 {
	/**
	 * 从右边到左边遍历，dp[i]表示第i天的值
	 * @param T
	 * @return
	 */
	public int[] dailyTemperatures(int[] T) {
		if(T.length<2){
			return new int[]{0};
		}
        //dp[i]表示第i天的天数
		int[] dp=new int[T.length];
		dp[T.length-1]=0;
		for(int i=T.length-2;i>=0;i--){
			for(int j=i+1;j<T.length;j++){
				if(T[i]<T[j]){
					dp[i]=j-i;break;
				}else if(dp[j]==0){
					dp[i]=0;break;
				}
			}
		}
		return dp;
    }
	/**
	 * 用一个单调递减栈
	 * @param T
	 * @return
	 */
	public static int[] dailyTemperatures1(int[] T) {
		Stack<Integer> stack = new Stack<>();
	    int[] ret = new int[T.length];
	    for(int i = 0; i < T.length; i++) {
	        while(!stack.isEmpty() && T[i] > T[stack.peek()]) {
	            int idx = stack.pop();
	            ret[idx] = i - idx;
	        }
	        stack.push(i);
	    }
	    return ret;
    }
	public static void main(String[] args) {
		int[] a={73,74,75,71,69,72,76,73};
		dailyTemperatures1(a);
	}
	
}
