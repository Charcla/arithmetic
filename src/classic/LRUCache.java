package classic;

import java.util.HashMap;

public class LRUCache {
	
	private Node head;
	private Node end;
	//缓存存储上限
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
		//初始化头尾节点
		head=new Node("","");
		end=new Node("","");
		head.pre=null;
		head.next=end;
		end.pre=head;
		end.next=null;
	}

	//查询元素
	public String get(String key){
		Node node=hashMap.get(key);
		if(node==null){
			return null;
		}
		//刷新node节点位置
		refreshNode(node);
		return node.value;
	}

	//放入元素
	public void put(String key,String value){
		Node node=hashMap.get(key);
		if(node==null){
			//如果key不存在，插入
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
		//删除节点
		removeNode(node);
		//添加节点
		addNode(node);
	}

	//尾部插入节点
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
			node.pre.next=end;//移除尾节点
			end.pre=node.pre;
		}else if(node.pre==head){
			head.next=node.next;//移除头节点
			node.next.pre=head;
		}else{//移除一般节点
			node.pre.next=node.next;
			node.next.pre=node.pre;
		}
		return node.key;
	}

	public static void main(String[] args) {
		LRUCache lruCache=new LRUCache(5);
		lruCache.put("1","用户1");
		lruCache.put("2","用户2");
		lruCache.put("3","用户3");
		lruCache.put("4","用户4");
		lruCache.put("5","用户5");
		lruCache.put("6","用户6");
//		lruCache.put("7","用户7");
//		lruCache.put("8","用户8");
//		lruCache.put("9","用户9");
		
		System.out.println(lruCache.get("2"));
	}

}
