package leetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int[] res=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums2.length;i++){
        	while(!s.isEmpty()&&s.peek()<nums2[i])
        		map.put(s.pop(), nums2[i]);
        	s.push(nums2[i]);
        }
		for(int i=0;i<nums1.length;i++){
			res[i]=map.getOrDefault(nums1[i], -1);
		}
		return res;
    }
	public static void main(String[] args) {
		int[] nums1={4,1,2};
		int[] nums2={1,3,4,2};
		nextGreaterElement(nums1,nums2);
	}
}
