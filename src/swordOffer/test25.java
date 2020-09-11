package swordOffer;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author skyou
 *
 */
public class test25 {
	
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null) return null;
		RandomListNode rand=pHead;
		//第一步现在旧链表中创建新链表，先不管随机节点
		while(rand!=null){
			RandomListNode p=new RandomListNode(rand.label);
			p.next=rand.next;
			rand.next=p;
			rand=rand.next.next;
		}
		
		rand=pHead;
		//第二步再去处理随机节点
		while(rand!=null){
			if(rand.random!=null){
				rand.next.random=rand.random;
			}
			rand=rand.next.next;
		}
		
		RandomListNode s=new RandomListNode(0);
        RandomListNode head=s;
        while(pHead!=null){
           RandomListNode q=pHead.next;
           pHead.next=q.next;
           q.next=s.next;
           s.next=q;
           s=s.next;
           pHead=pHead.next;
          
            
        }	
		
		return head.next;
        
    }
	
	public static void main(String[] args) {
		test25 t=new test25();
		RandomListNode node1=new RandomListNode(1);
		RandomListNode node2=new RandomListNode(2);
		RandomListNode node3=new RandomListNode(3);
		RandomListNode node4=new RandomListNode(4);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node1.random=node3;
		node3.random=node1;
		node4.random=node2;
		
		RandomListNode r=t.Clone(node1);
		System.out.println(r.label);
	}
}
