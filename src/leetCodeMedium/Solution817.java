package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution817 {
	//时间复杂度O(n),空间复杂度0(max(G))
	public static int numComponents(ListNode head, int[] G) {
		//先创建一个hash数组，hash[i]=1表示i在G中出现过
		int max=G[0];
		for(int i:G){
			max=Math.max(max, i);
		}
        int[] hash=new int[max+1];
        for(int i=0;i<G.length;i++){
        	hash[G[i]]=1;
        }
        ListNode cur=head;
        int sum=0;
        int len=0;//len表示这个子串能到的最大长度
        while(cur!=null){
        	if(cur.val<=max&&hash[cur.val]==1){ //这个链表节点在G中
        		len++;
        	}else{
        		if(len>0) //如果当前节点不在，那么只要len>0,说明之前也有串
        			sum++;
        		len=0; //重置len;
        	}
        	cur=cur.next;
        }
        if(len>0)  //这种情况是链表遍历完了的情况，但最后一个串没有累计
        	sum++;
        return sum;
    }
	
	public static int numComponents2(ListNode head, int[] G){
		Map<Integer,Integer> map=new HashMap<>();
		for(int g:G){
			map.put(g, 1);
		}
		ListNode cur=head;
        int sum=0;
        int len=0;//len表示这个子串能到的最大长度
        while(cur!=null){
        	if(map.get(cur.val)!=null){ //这个链表节点在G中
        		len++;
        	}else{
        		if(len>0) //如果当前节点不在，那么只要len>0,说明之前也有串
        			sum++;
        		len=0; //重置len;
        	}
        	cur=cur.next;
        }
        if(len>0)  //这种情况是链表遍历完了的情况，但最后一个串没有累计
        	sum++;
        return sum;
		
	}
	public static void main(String[] args) {
		ListNode node=new ListNode(3);
		node.next=new ListNode(4);
		node.next.next=new ListNode(0);
		node.next.next.next=new ListNode(2);
		node.next.next.next.next=new ListNode(1);
		int[] G={4};
		System.out.println(numComponents2(node, G));
	}
}
