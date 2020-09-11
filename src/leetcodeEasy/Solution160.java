package leetcodeEasy;

public class Solution160 {
	/**
	 * ��������ָ�룬һ��ѭ�������󣬶̵�����ĸպõ��ȱ�����ɣ��Ǹ�ָ��ָ������һ��������׽ڵ�
	 * Ҳ˳����ȥ�˳��Ȳ�
	 * ʱ�临�Ӷ�O(n)
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
