package leetcodeHard;

public class Solution25 {
	//ʱ�临�Ӷ�O(n);
	//�ռ临�Ӷ�O(n/k);
	public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int count=0;
        while(cur!=null&&count!=k){
        	cur=cur.next;
        	count++;
        }
        if(count==k){
        	cur=reverseKGroup(cur, k); //�ݹ鴦��
        	while(count-->0){     //�����Ǵ������
        		ListNode temp=head.next;
        		head.next=cur;
        		cur=head;
        		head=temp;
        	}
        	head=cur;
        }
        return head;
		
    }
	
	public static void main(String[] args) {
		ListNode root=new ListNode(1);
		root.next=new ListNode(2);
		root.next.next=new ListNode(3);
		root.next.next.next=new ListNode(4);
		root.next.next.next.next=new ListNode(5);
		ListNode res=reverseKGroup(root,2);
		while(res!=null){
			System.out.println(res.val);
			res=res.next;
		}
	}
}
