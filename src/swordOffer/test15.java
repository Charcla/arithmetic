package swordOffer;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 * @author skyou
 *
 */
public class test15 {
	
	public static ListNode Merge(ListNode list1,ListNode list2) {

		//因为创建了一个新链表，占用内存有点大，可以用递归
		ListNode list=new ListNode(0);
		ListNode temp=list;
		while(list1!=null&&list2!=null){
			if(list1.val<=list2.val){
				temp.next=list1;
				temp=temp.next;
				list1=list1.next;
			}else{
				temp.next=list2;
				temp=temp.next;
				list2=list2.next;
			}
		}
		if(list1!=null){
			temp.next=list1;
		}else{
			temp.next=list2;
		}
		list=list.next;
//		while(list!=null){
//			System.out.println(list.val);
//			list=list.next;
//		}
		return list;
     
    }
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1);
		ListNode list2=new ListNode(2);
		ListNode list3=new ListNode(3);
		ListNode list4=new ListNode(4);
		ListNode list5=new ListNode(5);
		ListNode list6=new ListNode(6);
		ListNode list7=new ListNode(7);
		ListNode list8=new ListNode(8);
		ListNode list9=new ListNode(9);
		ListNode list10=new ListNode(10);
		
		list1.next=list2;
		list2.next=list3;
		list3.next=list4;
		list4.next=list5;
		
		list6.next=list7;
		list7.next=list8;
		list8.next=list9;
		list9.next=list10;
		
		Merge(list1,list6);
	}

}
