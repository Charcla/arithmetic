package leetCodeMedium;

public class Solution82 {
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null)
        	return head;
		ListNode newHead=new ListNode(Integer.MIN_VALUE);
		newHead.next=head;
        ListNode pre=newHead;
        ListNode p=head;
        while(p.next!=null){
        	if(p.val==p.next.val){
        		while(p.next.next!=null&&p.val==p.next.next.val)
        			p=p.next;
        		p=p.next.next;
        		pre.next=p;
        	}else{
        		pre=pre.next;
        		p=p.next;
        	}		
        }
        return newHead.next==null?null:newHead.next;
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(3);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(4);
//		ListNode l6=new ListNode(4);
//		ListNode l7=new ListNode(5);
		l1.next=l2;//l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;
		deleteDuplicates(l1);
	}
}
