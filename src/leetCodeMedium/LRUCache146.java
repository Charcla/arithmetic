package leetCodeMedium;

import java.util.HashMap;

/**
 * @author Charcl
 * @date 2019/10/28 15:51
 */
public class LRUCache146 {

    //缓存大小
    private int capacity;
    //链表头节点
    private Node head;
    //链表尾节点
    private Node tail;
    private HashMap<Integer,Node> hashMap;

    class Node{
        private int key;
        private int value;
        private Node pre;
        private Node next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    public LRUCache146(int capacity) {
        hashMap=new HashMap<>();
        this.capacity=capacity;
        //初始化头尾节点
        head=new Node(-1,-1);
        tail=new Node(-2,-2);
        head.pre=null;
        head.next=tail;
        tail.pre=head;
        tail.next=null;
    }

    public int get(int key){
        Node node=hashMap.get(key);
        if(node==null){
            return -1;
        }
        //刷新node节点位置
        refreshNode(node);
        return node.value;
    }


    public void put(int key, int value) {
        Node node=hashMap.get(key);
        if(node==null){
            //如果key不存在，插入
            if(hashMap.size()>=capacity){
                int mostLeftKey=removeNode(head.next);
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

    private void refreshNode(Node node){
        if(node.next==tail){
            return;
        }
        //删除节点
        removeNode(node);
        //添加节点
        addNode(node);
    }

    //移除节点
    private int removeNode(Node node){
        //node头节点的情况
        if(node.pre==head){
            head.next=node.next;
            node.next.pre=head;
        }else if(node.next==tail){  //尾节点的情况
            node.pre.next=tail;
            tail.pre=node.pre;
        }else {  //普通节点的情况下
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
        return node.key;
    }

    //尾部插入节点
    private void addNode(Node node){
        tail.pre.next=node;
        node.pre=tail.pre;
        tail.pre=node;
        node.next=tail;
    }
}
