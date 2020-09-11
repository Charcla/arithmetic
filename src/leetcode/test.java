package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2=new LinkedList<>();
		l2.add(2);
		l2.add(3);
		l2.add(1);
		list.add(l1);
		list.add(l2);
		System.out.println(l1.get(0)==l1.get(1));
	}

}
