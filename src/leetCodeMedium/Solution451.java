package leetCodeMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution451 {
	//�������ȶ��У��Ƚ��������map,Ȼ�����ȶ�����ʵ�֣�ʱ��O(n*logn)������23%;
	public static String frequencySort(String s) {
		StringBuilder sb=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	char c=s.charAt(i);
        	if(map.containsKey(c)){
        		map.put(c, map.get(c)+1);
        	}else{
        		map.put(c, 1);
        	}
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>((v1,v2)->v2.getValue()-v1.getValue());//�󶥶�
        pq.addAll(map.entrySet());
        int len=pq.size();
        for(int i=0;i<len;i++){
        	char key=pq.peek().getKey();  //��ȡ�Ѷ�Ԫ�صļ�
        	int value=pq.poll().getValue();//��ȡ�������Ѷ�Ԫ�ص�ֵ
        	while(value-->0)
        		sb.append(key);	
        }       	
        return sb.toString();
    }
	
	//����hash�������飬���������ַ�������ֵ���ǳ��ִ�����Ȼ�������ҵ���ʱ��O(n*logn),����94%;
	public static String frequencySort1(String s){
		int[] hash=new int[256];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)]++;
		}
		int[] hash1=hash.clone();//���������Ϊ���ҵ�hash����������Ӧ���±�
		Arrays.sort(hash);//����������
		for(int i=255;i>=0&&hash[i]>0;i--){//Ϊ0�Ĳ���ֱ�Ӳ��ù�
			for(int j=0;j<256;j++){   //��δ����������ҵ���Ӧֵ
				if(hash[i]==hash1[j]){
					while(hash1[j]-->0)
						sb.append((char)j);
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(frequencySort1("tree"));
		System.out.println();
	}
}
