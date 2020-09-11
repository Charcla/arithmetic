package leetCodeMedium;

import java.util.Stack;

/**
 * Created by skyou on 2019/5/30.
 */
public class Solution445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int sum=0;
        ListNode list=new ListNode(0);
        while (!s1.isEmpty()||!s2.isEmpty()){
            if(!s1.isEmpty())sum+=s1.pop();
            if(!s2.isEmpty())sum+=s2.pop();
            list.val=sum%10;
            ListNode head=new ListNode(sum/10);
            head.next=list;
            list=head;
            sum/=10;
        }
        return list.val == 0 ? list.next : list;
    }
}
