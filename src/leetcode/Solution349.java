package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * �����������飬��дһ���������������ǵĽ�����
 * @author skyou
 *
 */
public class Solution349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		int num=0;
		//���hash��ļ�������ֵ�ǳ��ִ���
		Hashtable<Integer,Integer> map=new Hashtable<>();
		List<Integer> list=new ArrayList<>();
		for(int i:nums1){
			num=map.get(i)!=null?map.get(i):0;
			map.put(i, num+1);
		}
		for(int i:nums2){
			num=map.get(i)!=null?map.get(i):0;
			if(num>0){
				list.add(i);
				map.put(i, 0);
			}
		}
		int[] result=new int[list.size()];
		for(int i=0;i<list.size();i++){
			result[i]=list.get(i);
		}
		return result;

  
    }
	public static void main(String[] args) {
		int[] nums1={4,9,5};
		int[] nums2={9,4,9,8,4};
		int[] res=intersection(nums1, nums2);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
		
	}
}
