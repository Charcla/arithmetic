package leetCodeMedium;

/**
 * ��������ʱ�临�Ӷ�0(n*logn),�ռ�0(1)
 * @author skyou
 *
 */
public class Solution148 {
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		return mergeSort(head);
    }

	private ListNode mergeSort(ListNode head) {
		if(head.next==null){
			return head;
		}
		ListNode fast=head,slow=head,pre=null;
		while(fast!=null&&fast.next!=null){//����ָ�뷨�ҵ������м�
			pre=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		pre.next=null;
		ListNode l=mergeSort(head);
		ListNode r=mergeSort(slow);
		return merge(l,r);
	}
	//�ϲ�
	private ListNode merge(ListNode l, ListNode r) {
		ListNode newHead=new ListNode(Integer.MAX_VALUE);
		ListNode cur=newHead;
		while(l!=null&&r!=null){
			if(l.val<=r.val){
				cur.next=l;
				cur=cur.next;
				l=l.next;
			}else{
				cur.next=r;
				cur=cur.next;
				r=r.next;
			}
		}
		if(l!=null)
			cur.next=l;
		if(r!=null)
			cur.next=r;
		return newHead.next;
	}
}
