package leetcodeEasy;
/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * @author skyou
 *
 */
public class Solution92 {
	/**
	 * 时间复杂度O(n):n之前的链表全都要便利一遍
	 * 空间复杂度O(1)
	 * @param head
	 * @param m
	 * @param n
	 * @return
	 */
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		int changeLen=n-m+1; //需要逆置的长度
		ListNode preHead=null;//需要逆置的串的头结点
		ListNode result=head;//最终转换后的链表头结点，也就是需要返回的
		while(head!=null && --m>0){ //将head向后移m-1个位置
			preHead=head;
			head=head.next;
		}
		ListNode tailNode=head;
		ListNode newHead=null;
		while(head!=null&&changeLen>0){
			ListNode next=head.next;
			head.next=newHead;
			newHead=head;
			head=next;
			changeLen--;
		}
		tailNode.next=head; //逆置后的那段链表接上原链表后面那部分不用逆置的链表
		if(preHead!=null){
			preHead.next=newHead;
		}else{
			result=newHead;
		}
		return result;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
//		ListNode l3=new ListNode(3);
//		ListNode l4=new ListNode(4);
//		ListNode l5=new ListNode(5);
		l1.next=l2;
//		l2.next=l3;l3.next=l4;l4.next=l5;
		ListNode l=reverseBetween(l1,1,2);
		while(l!=null){
			System.out.println(l.val);
			l=l.next;
		}
	}
}
