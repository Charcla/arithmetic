package leetcodeEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution884 {
	public static String[] uncommonFromSentences(String A, String B) {
        String[] s1=A.split(" ");
        String[] s2=B.split(" ");
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length;i++){
        	int num=map.getOrDefault(s1[i],0);
        	map.put(s1[i],++num);
        }
        for(int i=0;i<s2.length;i++){
        	int num=map.getOrDefault(s2[i],0);
        		map.put(s2[i],++num);      	
        }
        for(Map.Entry<String, Integer> entry:map.entrySet()){
        	if(entry.getValue()==0){
        		list.add(entry.getKey());
        	}
        }
        String[] res=new String[list.size()];
        int i=0;
        for(String s:list){
        	res[i++]=s;
        }
        return res;	
    }
	public static void main(String[] args) {
		uncommonFromSentences("this apple is sweet","this apple is sour");
	}
}
