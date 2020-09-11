package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Solution817 {
	//ʱ�临�Ӷ�O(n),�ռ临�Ӷ�0(max(G))
	public static int numComponents(ListNode head, int[] G) {
		//�ȴ���һ��hash���飬hash[i]=1��ʾi��G�г��ֹ�
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
        int len=0;//len��ʾ����Ӵ��ܵ�����󳤶�
        while(cur!=null){
        	if(cur.val<=max&&hash[cur.val]==1){ //�������ڵ���G��
        		len++;
        	}else{
        		if(len>0) //�����ǰ�ڵ㲻�ڣ���ôֻҪlen>0,˵��֮ǰҲ�д�
        			sum++;
        		len=0; //����len;
        	}
        	cur=cur.next;
        }
        if(len>0)  //�������������������˵�����������һ����û���ۼ�
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
        int len=0;//len��ʾ����Ӵ��ܵ�����󳤶�
        while(cur!=null){
        	if(map.get(cur.val)!=null){ //�������ڵ���G��
        		len++;
        	}else{
        		if(len>0) //�����ǰ�ڵ㲻�ڣ���ôֻҪlen>0,˵��֮ǰҲ�д�
        			sum++;
        		len=0; //����len;
        	}
        	cur=cur.next;
        }
        if(len>0)  //�������������������˵�����������һ����û���ۼ�
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
