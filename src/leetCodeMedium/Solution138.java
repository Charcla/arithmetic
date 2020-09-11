package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的深度拷贝。 
 * @author skyou
 *
 */

class RandomListNode {
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
}

public class Solution138 {
	public static RandomListNode copyRandomList(RandomListNode head) {
		Map<RandomListNode,Integer> map=new HashMap();
		Vector<RandomListNode> vec=new Vector<>();
		RandomListNode pre=head;
		int i=0;
		while(pre!=null){
			vec.add(new RandomListNode(pre.label));
			map.put(pre, i);
			i++;
			pre=pre.next;
		}
		pre=head;
		i=0;
		vec.add(null);
		while(pre!=null){
			vec.get(i).next=vec.get(i+1);
			if(pre.random!=null){
				int id=map.get(pre.random);
				vec.get(i).random=vec.get(id);
			}
			pre=pre.next;
			i++;
		}
		return vec.get(0);
    }
	public static void main(String[] args) {
		RandomListNode l1=new RandomListNode(1);
		RandomListNode l2=new RandomListNode(2);
		RandomListNode l3=new RandomListNode(3);
		RandomListNode l4=new RandomListNode(4);
		RandomListNode l5=new RandomListNode(5);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		l1.random=l3;l2.random=l4;l3.random=l3;l4.random=null;l5.random=l4;
		System.out.println(copyRandomList(l1).label);
	}
}
