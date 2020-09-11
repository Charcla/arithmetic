package leetCodeMedium;

public class Solution328 {
	public static ListNode oddEvenList(ListNode head) {
		if(head==null||head.next==null||head.next.next==null)
			return head;
        ListNode p=head;//p��������ͷ�ڵ�
        ListNode sec=head.next;//sec����ż����ͷ���
        ListNode secHead=sec;
        while(p!=null&&p.next!=null&&sec!=null&&sec.next!=null){
        	p.next=sec.next; //���е���
        	p=p.next;
        	sec.next=p.next;
        	sec=sec.next;
        }
        if(p.next!=null){  //�����ڵ���ܶ����
        	p.next=sec.next;
        }
        p.next=secHead;
        return head;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		oddEvenList(l1);
	}
}
