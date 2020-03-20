package io.renjiezhang.LinkedListQueue;

/**
 * @author: renjie.zhang
 * @date:2019/8/25-16:23
 * @Description: 使用链表实现队列
 */
public class LinkedListQueue {
    private Node head =new Node(0);

    public Node getHead() {
        return head;
    }

    /**
     * 队列入队操作
     * @param node
     */
    public void EnQueue(Node node){
        Node temp  = head;
        while (true){
            if (temp.next == null){
               break;
            }
            temp =  temp.next;
        }
        temp.next = node;
    }

    /**
     * 队列出队操作
     * @param head
     * @return
     */
    public Node DeQueue(Node head){
        if(head.next == null){
            return null;
        }
        Node current = head.next;
        head.next = current.next;
        return current;
    }

    /**
     * 显示队列
     * @param head
     */
    public void show(Node head){
        if(head.next == null){
            System.out.println("队列为空");
        }
        Node temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
    /**
     * 判断队列是否为空
     * @param head
     * @return
     */
    public boolean isEmpty(Node head){
        if(head.next == null){
            return true;
        }
        return false;
    }

}
