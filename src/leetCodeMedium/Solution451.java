package leetCodeMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution451 {
	//利用优先队列，先将结果放入map,然后优先队列来实现，时间O(n*logn)，击败23%;
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
        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>((v1,v2)->v2.getValue()-v1.getValue());//大顶堆
        pq.addAll(map.entrySet());
        int len=pq.size();
        for(int i=0;i<len;i++){
        	char key=pq.peek().getKey();  //获取堆顶元素的键
        	int value=pq.poll().getValue();//获取并弹出堆顶元素的值
        	while(value-->0)
        		sb.append(key);	
        }       	
        return sb.toString();
    }
	
	//利用hash创建数组，索引就是字符，数组值就是出现次数，然后排序找到，时间O(n*logn),击败94%;
	public static String frequencySort1(String s){
		int[] hash=new int[256];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)]++;
		}
		int[] hash1=hash.clone();//这个数组是为了找到hash数组排序后对应的下标
		Arrays.sort(hash);//将数组排序
		for(int i=255;i>=0&&hash[i]>0;i--){//为0的部分直接不用管
			for(int j=0;j<256;j++){   //从未排序的里面找到对应值
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
