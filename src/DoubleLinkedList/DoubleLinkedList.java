package io.renjiezhang.DoubleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/25-15:24
 * @Description: 双向链表
 */
public class DoubleLinkedList {
    //头节点
    private Node head = new Node(0);

    public Node getHead() {
        return head;
    }

    /**
     * 添加节点到链表中
     * @param node
     */
    public void addNode(Node node){
        Node temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 删除链表的节点
     * @param node
     */
    public boolean deleteNode(Node node){
        if(head.next == null){
            System.out.println("链表为空");
            return false;
        }
        Node temp = head.next;
        boolean flag = false;
        while (true){
            if(temp.data == node.data){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next = temp.next;
            //需要判断它的下一个节点是否为空（比如删除尾节点）
            if(temp.next != null){
                temp.next.pre= temp.pre;
            }
        }
        return true;
    }

    /**
     * 获得链表的count
     * @param head
     * @return
     */
    public int getCount(Node head){
        int count = 0;
        if(head.next == null){
            return 0;
        }
        Node temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            count++;
            temp = temp.next;
        }
        return count;
    }
    /**
     * 展示链表
     */
    public void show(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        while (temp != null){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
