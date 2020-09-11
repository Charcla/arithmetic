package leetcodeEasy;

/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
 * 如果 pos 是 -1，则在该链表中没有环。
 * @author skyou
 *
 */
public class Solution141 {
	/**
	 * 时间复杂度O(n):n设为链表中节点的总数。
	 * 没有环的情况：快指针先到达尾部，时间取决于链表的长度，也就是O(n).
	 * 有环的情况:
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
	 * 返回环
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
        	fast=fast.next;  //快指针多走一步
        	if(fast==slow){
        		meet=fast;
        		break;
        	}
        }
        if(meet==null)
        	return null;
        while(head!=null&&meet!=null){ //找出环的切入点，快指针的速度是慢指针的两倍，在相遇的时候快指针的走的路是慢指针的两倍，所以头结点和相遇节点距离环的切点的距离是一样的
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
