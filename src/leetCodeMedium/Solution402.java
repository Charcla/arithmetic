package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution402 {
	public static String removeKdigits(String num, int k) {
		if(k>=num.length())
            return "0";
		ArrayList<Integer> list=new ArrayList<>();
		int i=0,length=num.length();
		while(k>=0&&i<length){
			int n=num.charAt(i)-'0';
			while(list.size()!=0&&n<list.get(list.size()-1)&&k>0){
				list.remove(list.size()-1);
				k--;
			}
			list.add(n);
			i++;
		}		
		while(list.get(0)==0&&list.size()>1){
			list.remove(0);
		}
		StringBuilder sb=new StringBuilder();
		for(int j=0;j<list.size()-k;j++){
			sb.append(list.get(j));
		}
		return sb.toString();
		      
    }
	public static void main(String[] args) {
		System.out.println(removeKdigits("1432219",3));
	}
}