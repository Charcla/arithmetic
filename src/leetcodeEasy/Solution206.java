package leetcodeEasy;
/**
 * ��תһ��������
 * @author skyou
 *
 */
public class Solution206 {
	/**
	 * ʱ�临�Ӷ�O(n)������ĳ���
	 * �ռ临�Ӷ�0(1)
	 * @param head
	 * @return
	 */
	public static ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null){
        	ListNode next=head.next;
        	head.next=newHead;
        	newHead=head;
        	head=next;
        }
        return newHead;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		ListNode l=reverseList(l1);
		System.out.println(l.val);
	}
}
