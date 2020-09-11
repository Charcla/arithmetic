package leetcodeEasy;
/**
 * ����һ�������һ���ض�ֵ x����������зָ���ʹ������С�� x �Ľڵ㶼�ڴ��ڻ���� x �Ľڵ�֮ǰ��
 * ��Ӧ����������������ÿ���ڵ�ĳ�ʼ���λ�á�
 * @author skyou
 *
 */
public class Solution86 {
	/**
	 * ʱ�临�Ӷ�O(n)
	 * �ռ临�Ӷ�O(1)
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partition(ListNode head, int x) {
        ListNode lessNode=new ListNode(0);//����������ʱ����ͷ
        ListNode moreNode=new ListNode(0);
        ListNode tmpLessNode=lessNode;  //�����������
        ListNode tmpMoreNode=moreNode;
        while(head!=null){
        	if(head.val<x){
        		tmpLessNode.next=head;
        		tmpLessNode=head;
        	}else{
        		tmpMoreNode.next=head;
        		tmpMoreNode=head;
        	}
        	head=head.next;
        }
        tmpLessNode.next=moreNode.next;  //������������
        tmpMoreNode.next=null;
        return lessNode.next;
    }
}
