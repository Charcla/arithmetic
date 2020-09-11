package leetCodeMedium;

import java.util.Stack;

/**
 * 下一个更大元素 II
 * @author Charcl
 * @date 2020/5/19 11:20
 */
public class Solution503 {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] n=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i%nums.length]){
                stack.pop();
            }
            n[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a={1,2,1};
        Solution503.nextGreaterElements(a);
    }
}
