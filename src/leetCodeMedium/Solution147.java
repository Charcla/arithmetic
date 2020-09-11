package leetCodeMedium;

public class Solution147 {
	public static ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		ListNode pre;
		//dummy表示有序区间的第一个节点
		dummy.next = head;
		//head表示有序区间的最后一个节点
		//每次遍历，当前节点如果大于head,就直接跳过
		while (head!=null&&head.next!=null){
			if(head.val<=head.next.val){
				head=head.next;
				continue;
			}
			pre=dummy;
			//插入到有序区间
			while (pre.next.val<head.next.val){
				pre=pre.next;
			}
			ListNode temp=head.next;
			head.next=temp.next;
			temp.next=pre.next;
			pre.next=temp;
		}
		return dummy.next;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(6);
		ListNode l2=new ListNode(5);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(1);
		ListNode l5=new ListNode(8);
		ListNode l6=new ListNode(7);
		ListNode l7=new ListNode(2);
		ListNode l8=new ListNode(4);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;l7.next=l8;
		insertionSortList(l1);
		while(l1!=null)
			System.out.println(l1.val);
	}
}
