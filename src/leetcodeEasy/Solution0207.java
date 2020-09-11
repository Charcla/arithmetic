package leetcodeEasy;

/**
 * @author Charcl
 * @date 2020/3/25 16:57
 */
public class Solution0207 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA=headA,pB=headB;
        while(pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }

}
