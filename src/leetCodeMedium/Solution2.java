package leetCodeMedium;

public class Solution2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode(0);
        ListNode cur=newHead;
        int carry=0; //这个用来储存进位信息
        while(l1!=null||l2!=null){
        	int x=l1!=null?l1.val:0;
        	int y=l2!=null?l2.val:0;
        	int sum=x+y+carry;
        	carry=sum/10;
        	cur.next=new ListNode(sum%10);
        	if(l1!=null)l1=l1.next;
        	if(l2!=null)l2=l2.next;
        	cur=cur.next;
        }
        if(carry==1){
        	cur.next=new ListNode(1);
        }
        return newHead.next;
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(3);
		l1.next=l2;l2.next=l3;
		ListNode l4=new ListNode(5);
		ListNode l5=new ListNode(6);
		ListNode l6=new ListNode(4);
		l4.next=l5;l5.next=l6;
		System.out.println(addTwoNumbers(l1, l4).val);
	}
}
