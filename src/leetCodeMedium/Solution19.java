package leetCodeMedium;

public class Solution19 {
	/**
	 * ʱ�临�Ӷ�:O(l)
	 * �ռ临�Ӷ�:O(1)
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        	return null;
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode slow=newHead,fast=newHead;
        for(int i=0;i<=n;i++){
        	fast=fast.next;
        }
        while(fast!=null){
        	fast=fast.next;
        	slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
