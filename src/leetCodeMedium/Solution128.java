package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution128 {
	public static int longestConsecutive(int[] nums) {
        /**
        	����һ��map���������ѡ����е����ұ߽缰�䳤��, ����{1,2,3,4,5}������1��5��Ӧ�ĳ��ȶ���5
        	���α���ÿ����num, ���map�д���num-1��num+1�����num���������г��ȼ���߽�ֵ
        **/
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int num : nums) {
            if(!map.containsKey(num)) {
                // ��ȡ���ұ߽��Ӧ�����г���
                int left = map.getOrDefault(num-1, 0);
                int right = map.getOrDefault(num+1, 0);
                // ��������г���
                int len = left+right+1;
                ret = len > ret ? len : ret;
                map.put(num-left, len);
                map.put(num+right, len);
                // ��num����map�з�ֹ�ظ��ж�(�ؼ����ڽ�num����keyset��, value����������ֵ)
                map.put(num, len);
            }
        }
        return ret;
    }
	
	public static void main(String[] args) {
		int[] nums={100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}
}
