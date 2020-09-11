package leetCodeMedium;
/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * @author skyou
 *
 */
public class Solution24 {
	/**
	 * 是案件复杂度O(n)，空间复杂度O(1)
	 * @param head
	 * @return
	 */
	public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
        	return head;
        }
        ListNode tmp,newHead=new ListNode(0);//新建立一个新的头结点
        newHead.next=head;
        ListNode p=newHead;
        while(p.next!=null&&p.next.next!=null){ //确保链表的长度无论单还是偶都能操作
        	tmp=p.next;
        	p.next=p.next.next;
        	tmp.next=tmp.next.next;
        	p.next.next=tmp;
        	p=p.next.next;
        }
        return newHead.next;
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		l1.next=l2;l2.next=l3;
		swapPairs(l1);
	}
}
