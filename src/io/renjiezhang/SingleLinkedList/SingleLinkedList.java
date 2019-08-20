package io.renjiezhang.SingleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/8/20-22:13
 * @Description: 单链表
 */
public class SingleLinkedList {
    //首先初始化头节点，不存放任何数据
    private Node head = new Node(0);

    /**
     * 添加节点到单向链表
     * @param node 节点
     */
    public void addNode(Node node){
        //（哨兵）辅助节点遍历temp
        Node temp = head;
        //遍历链表，当来到最后一个节点时，退出循环
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        //当跳出while循环时，temp来到了最后一个节点
        temp.next = node;
    }

    /**
     *遍历链表
     */
    public void Show(){
        if(head.next == null){
            System.out.println("链表尾空");
            return;
        }
        Node temp = head.next;
        while (true){
            if (temp == null){
                break;
            }
            //输出节点
            System.out.println(temp);
            //next后移
            temp = temp.next;
        }
    }

}
