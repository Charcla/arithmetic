package leetcodeEasy;

public class Solution160 {
	/**
	 * 建立两个指针，一轮循环结束后，短的链表的刚好的先遍历完成，那个指针指向另外一条链表的首节点
	 * 也顺便消去了长度差
	 * 时间复杂度O(n)
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode pA=headA,pB=headB;
        while(pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }
}
