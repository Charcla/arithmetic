package leetcodeEasy;
/**
 * ��ת��λ�� m �� n ��������ʹ��һ��ɨ����ɷ�ת��
 * ˵��:
 * 1 �� m �� n �� �����ȡ�
 * @author skyou
 *
 */
public class Solution92 {
	/**
	 * ʱ�临�Ӷ�O(n):n֮ǰ������ȫ��Ҫ����һ��
	 * �ռ临�Ӷ�O(1)
	 * @param head
	 * @param m
	 * @param n
	 * @return
	 */
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		int changeLen=n-m+1; //��Ҫ���õĳ���
		ListNode preHead=null;//��Ҫ���õĴ���ͷ���
		ListNode result=head;//����ת���������ͷ��㣬Ҳ������Ҫ���ص�
		while(head!=null && --m>0){ //��head�����m-1��λ��
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
		tailNode.next=head; //���ú���Ƕ��������ԭ��������ǲ��ֲ������õ�����
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
