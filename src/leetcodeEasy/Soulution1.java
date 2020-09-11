package leetcodeEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Soulution1 {
	
	/*
	 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ�� ���� ������
	 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
	 * 
	 * ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(n)(����Ŀؼ�ȡ��hash���д洢��Ԫ�����������n��)
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int m=target-nums[i];
			if(map.containsKey(m)){
				return new int[]{i,map.get(m)};
			}
			map.put(nums[i],i);
		}
		return null;
    }
}
