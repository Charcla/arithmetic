package leetcodeHard;


/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * @author skyou
 *
 */
public class Solution23 {
	/**
	 * 这个是合并两个有序链表
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list=new ListNode(0);
		ListNode temp=list;
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				temp.next=l1;
				temp=temp.next;
				l1=l1.next;
			}else{
				temp.next=l2;
				temp=temp.next;
				l2=l2.next;
			}
		}
		if(l1!=null){
			temp.next=l1;
		}else{
			temp.next=l2;
		}
		return list.next;
    }
	/**
	 * 把k个数组分成两组，分别合并，然后递归
	 * @param lists
	 * @return
	 */
	public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        	return null;
        if(lists.length==1)
        	return lists[0];
        if(lists.length==2)
        	return mergeTwoLists(lists[0], lists[1]);
        ListNode[] list1=new ListNode[lists.length/2+1];//将这个数组拆分为两个数组
        ListNode[] list2=new ListNode[lists.length/2+1];
        int mid=lists.length/2;
        for(int i=0;i<mid;i++){
        	list1[i]=lists[i];
        }
        for(int i=mid;i<lists.length;i++){
        	list2[i-mid]=lists[i];
        }
        ListNode l1=mergeKLists(list1);  
        ListNode l2=mergeKLists(list2);
        
        return mergeTwoLists(l1, l2);
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(5);
		l1.next=l2;l2.next=l3;
		ListNode l4=new ListNode(1);
		ListNode l5=new ListNode(3);
		ListNode l6=new ListNode(4);
		l4.next=l5;l5.next=l6;
		ListNode l7=new ListNode(2);
		ListNode l8=new ListNode(6);
		l7.next=l8;
		ListNode[] list={l1,l4,l7};
		mergeKLists(list);
	}
	
}
