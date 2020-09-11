package classic;

import java.util.HashMap;

public class LRUCache {
	
	private Node head;
	private Node end;
	//����洢����
	private int limit;

	private HashMap<String,Node> hashMap;

	class Node{
		public String key;
		public String value;
		public Node pre;
		public Node next;
		Node(String key,String value){
			this.key=key;
			this.value=value;
		};

	}

	public LRUCache(int limit){
		hashMap=new HashMap<>();
		this.limit=limit;
		//��ʼ��ͷβ�ڵ�
		head=new Node("","");
		end=new Node("","");
		head.pre=null;
		head.next=end;
		end.pre=head;
		end.next=null;
	}

	//��ѯԪ��
	public String get(String key){
		Node node=hashMap.get(key);
		if(node==null){
			return null;
		}
		//ˢ��node�ڵ�λ��
		refreshNode(node);
		return node.value;
	}

	//����Ԫ��
	public void put(String key,String value){
		Node node=hashMap.get(key);
		if(node==null){
			//���key�����ڣ�����
			if(hashMap.size()>=limit){
				String mostLeftKey=removeNode(head.next);
				hashMap.remove(mostLeftKey);
			}
			node=new Node(key,value);
			addNode(node);
			hashMap.put(key, node);
		}else{
			node.value=value;
			refreshNode(node);
		}
	}

	public void remove(String key){
		Node node=hashMap.get(key);
		removeNode(node);
		hashMap.remove(key);
	}

	private void refreshNode(Node node) {
		if(node.next==end){
			return;
		}
		//ɾ���ڵ�
		removeNode(node);
		//��ӽڵ�
		addNode(node);
	}

	//β������ڵ�
	private void addNode(Node node) {
//		if(end.pre!=head){
			end.pre.next=node;
			node.pre=end.pre;
			end.pre=node;
			node.next=end;
//		}
//		head.next

	}

	private String removeNode(Node node) {
		if(node.next==end){
			node.pre.next=end;//�Ƴ�β�ڵ�
			end.pre=node.pre;
		}else if(node.pre==head){
			head.next=node.next;//�Ƴ�ͷ�ڵ�
			node.next.pre=head;
		}else{//�Ƴ�һ��ڵ�
			node.pre.next=node.next;
			node.next.pre=node.pre;
		}
		return node.key;
	}

	public static void main(String[] args) {
		LRUCache lruCache=new LRUCache(5);
		lruCache.put("1","�û�1");
		lruCache.put("2","�û�2");
		lruCache.put("3","�û�3");
		lruCache.put("4","�û�4");
		lruCache.put("5","�û�5");
		lruCache.put("6","�û�6");
//		lruCache.put("7","�û�7");
//		lruCache.put("8","�û�8");
//		lruCache.put("9","�û�9");
		
		System.out.println(lruCache.get("2"));
	}

}
