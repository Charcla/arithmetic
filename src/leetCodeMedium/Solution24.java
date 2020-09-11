package leetCodeMedium;
/**
 * ����һ���������������������ڵĽڵ㣬�����ؽ����������
 * @author skyou
 *
 */
public class Solution24 {
	/**
	 * �ǰ������Ӷ�O(n)���ռ临�Ӷ�O(1)
	 * @param head
	 * @return
	 */
	public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
        	return head;
        }
        ListNode tmp,newHead=new ListNode(0);//�½���һ���µ�ͷ���
        newHead.next=head;
        ListNode p=newHead;
        while(p.next!=null&&p.next.next!=null){ //ȷ������ĳ������۵�����ż���ܲ���
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
