package leetCodeMedium;

import java.util.List;

/**
 * @author Charcl
 * @date 2019/9/16 19:24
 */
public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }else if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode pre=head;
        ListNode p=pre.next;
        ListNode q=p.next;
        while (q!=null&&q.next!=null){
            pre=pre.next;
            p=pre.next;
            q=q.next.next;
        }
        //将中点左边的链表分离
        pre.next=null;
        TreeNode root=new TreeNode(p.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(p.next);
        return root;
    }
}
