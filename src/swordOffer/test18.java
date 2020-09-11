package swordOffer;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author skyou
 *
 */
public class test18 {
	
	public static ListNode ReverseList(ListNode head) {
		
		ListNode newHead=null;
		ListNode temp=head;
		ListNode pNode=null;
		if(head==null){
			return null;
		}
		while(temp!=null){
			newHead=new ListNode(temp.val);
			newHead.next=pNode;
			pNode=newHead;
			temp=temp.next;
		}
		return newHead;
	
    }
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		ListNode aaa=ReverseList(node1);
		System.out.println(aaa.val);
	}

}
