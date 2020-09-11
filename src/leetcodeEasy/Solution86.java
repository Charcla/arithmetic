package leetcodeEasy;
/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * @author skyou
 *
 */
public class Solution86 {
	/**
	 * 时间复杂度O(n)
	 * 空间复杂度O(1)
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partition(ListNode head, int x) {
        ListNode lessNode=new ListNode(0);//创立两个临时链表头
        ListNode moreNode=new ListNode(0);
        ListNode tmpLessNode=lessNode;  //用这个区操作
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
        tmpLessNode.next=moreNode.next;  //连接两个链表
        tmpMoreNode.next=null;
        return lessNode.next;
    }
}
