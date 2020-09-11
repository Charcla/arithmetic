package leetcodeHard;

import javax.xml.ws.Holder;
import java.util.Stack;

/**
 * @author Charcl
 * @date 2019/12/5 14:39
 */
public class Solution84 {
    /**
     * 时间0(n*logn)
     * 空间（1）
     * 找到最矮的那个柱子，最大面积要么在这个最矮柱子往两边延伸，要么就在这个柱子的左边或右边
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {

        return calculateArea(heights, 0, heights.length - 1);
    }

    public int calculateArea(int[] heights,int lo,int hi){
        if(lo>hi){
            return 0;
        }
        int minIndex=lo;
        for(int i=lo;i<=hi;i++){
            if(heights[i]<heights[minIndex]){
                minIndex=i;
            }
        }
        return Math.max(heights[minIndex]*(hi-lo+1),Math.max(calculateArea(heights,lo,minIndex-1),calculateArea(heights,minIndex+1,hi)));
    }

    /**
     * 单调栈
     * 时间O(n) 数组中的每个元素都会被弹出栈一次，压入栈一次
     * 空间O(n)
     * @param heights
     * @return
     */
    public static int largestRectangleArea2(int[] heights) {

        Stack<Integer> s=new Stack<>();
        s.push(-1);
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            while (s.peek()!=-1&&heights[s.peek()]>=heights[i]){
                maxArea=Math.max(maxArea,heights[s.pop()]*(i-s.peek()-1));
            }
            s.push(i);
        }
        while (s.peek() != -1)
            maxArea = Math.max(maxArea, heights[s.pop()] * (heights.length - s.peek() -1));
        return maxArea;
    }

    public static void main(String[] args) {
        int[] a={6,7,5,2,4,5,9,3};
        System.out.println(largestRectangleArea2(a));
    }



}
