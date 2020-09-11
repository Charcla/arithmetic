package leetcodeEasy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyou on 2019/5/20.
 */
public class Solution234 {

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        ListNode pre = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        while (pre != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(-129);
        ListNode l2=new ListNode(-129);
//        ListNode l3=new ListNode(2);
//        ListNode l4=new ListNode(1);
        l1.next=l2;
//        l2.next=l3;l3.next=l4;
        isPalindrome(l1);
        List a=new ArrayList();
    }
}
