package leetcodeEasy;

/**
 * ����һ�������ж��������Ƿ��л���
 * Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� 
 * ��� pos �� -1�����ڸ�������û�л���
 * @author skyou
 *
 */
public class Solution141 {
	/**
	 * ʱ�临�Ӷ�O(n):n��Ϊ�����нڵ��������
	 * û�л����������ָ���ȵ���β����ʱ��ȡ��������ĳ��ȣ�Ҳ����O(n).
	 * �л������:
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head,meet=null;
        while(fast!=null){
        	fast=fast.next;
        	slow=slow.next;
        	if(fast==null){
        		return false;
        	}
        	fast=fast.next;
        	if(fast==slow){
        		return true;
        	}
        }
        return false;
    }
	/**
	 * ���ػ�
	 * @param head
	 * @return
	 */
	public static ListNode detectCycle(ListNode head) {
		ListNode fast=head,slow=head,meet=null;
        while(fast!=null){
        	fast=fast.next;
        	slow=slow.next;
        	if(fast==null){
        		return null;
        	}
        	fast=fast.next;  //��ָ�����һ��
        	if(fast==slow){
        		meet=fast;
        		break;
        	}
        }
        if(meet==null)
        	return null;
        while(head!=null&&meet!=null){ //�ҳ���������㣬��ָ����ٶ�����ָ�����������������ʱ���ָ����ߵ�·����ָ�������������ͷ���������ڵ���뻷���е�ľ�����һ����
        	if(head==meet){
        		return head;
        	}
        	head=head.next;
        	meet=meet.next;
        }
        return null;
    }
	public static void main(String[] args) {
			ListNode l1=new ListNode(1);
			ListNode l2=new ListNode(2);
			ListNode l3=new ListNode(3);
			ListNode l4=new ListNode(4);
			l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l2;
			System.out.println(detectCycle(l1).val);
	}
}
