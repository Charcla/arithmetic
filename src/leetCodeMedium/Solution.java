package leetCodeMedium;

public class Solution {
	public static ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        	return head;
		int length=1;
        ListNode p=head;
        ListNode newHead = null;
        ListNode last=head;
        ListNode pre=head;
        while(p.next!=null){
        	length++;
        	p=p.next;
        }
        last=p;
        last.next=head;
        p=head;
        int n=length-k%length;
        while(n-->0){
        	pre=p;
        	p=p.next;
        	newHead=p;
        }
        pre.next=null;
        return newHead;  
    }
	public static void main(String[] args) {
		ListNode[] list=new ListNode[5];
		for(int i=0;i<list.length;i++)
			list[i]=new ListNode(i+1);
		list[0].next=list[1];
		list[1].next=list[2];
		list[2].next=list[3];
		list[3].next=list[4];
		ListNode l=rotateRight(list[0],2);
		while(l!=null){
			System.out.println(l.val);
			l=l.next;
		}
	}
}
