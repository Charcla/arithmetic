package swordOffer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * @author skyou
 *
 */
public class test14 {
	
	
	public static ListNode FindKthToTail(ListNode head,int k) {
		int i=0,j=0;
		ListNode temp=head;
		while(temp!=null){
			i++;
			temp=temp.next;
		}
		if(j<k){
			return null;
		}
		
		while(j!=(i-k)){
			j++;
			head=head.next;
		}
		return head;

    }
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		ListNode node5=FindKthToTail(node1,3);
		System.out.println(node5.val);
	}
	

}
