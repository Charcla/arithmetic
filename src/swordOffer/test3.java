package swordOffer;
import java.util.ArrayList;

public class test3 {

	//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> result=new ArrayList<>();
		ListNode temp=listNode;
		while(temp!=null){
			list.add(temp.val);
			temp=temp.next;
		}
		
		for(int i=list.size()-1;i>=0;i--){
			result.add(list.get(i));
		}
		
		return result;
        
    }
	
	
	
	public static void main(String[] args) {
		ListNode list=new ListNode(1);
		ListNode list2=new ListNode(2);
		ListNode list3=new ListNode(3);
		ListNode list4=new ListNode(4);
		list.next=list2;
		list2.next=list3;
		list3.next=list4;
		
		
		ArrayList<Integer> result=new ArrayList<>();
		result=printListFromTailToHead(list);
		for(int i=0;i<result.size();i++){
			System.out.println(result);
		}
		
		
	}

}
