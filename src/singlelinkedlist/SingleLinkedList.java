package singlelinkedlist;

import java.util.Stack;

public class SingleLinkedList {
    //首先初始化头节点，不存放任何数据
    private Node head = new Node(0);
    public Node GetHead(){
        return this.head;
    }
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
     * 删除节点
     * @param node
     * @return 删除成功返回true
     */
    public boolean deleteNode(Node node){
        //head节点不能够变化
        //首先找到所要删除节点的前一个节点（temp）
        Node temp = head;
        //标志是否找到节点
        boolean flag= false;
        while(true){
            if (temp.next == null){
                break;
            }
            if(temp.next.data == node.data){
                //待删除的前一个节点找到了
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            //找到了元素
            temp.next = temp.next.next;
            return true;
        }else{
            return false;
        }
    }

    /**
     * 获得链表的有效节点个数
     * @param head 链表的头节点
     * @return 头节点个数
      */
    public int GetCount(Node head){
        if(head.next == null){
            return 0;
        }
        int count = 0 ;
        Node current = head.next;
        while(current != null){
            count++;
            current =current.next;
        }
        return count;
    }

    /**
     *遍历链表
     */
    public void Show(){
        if(head.next == null){
            System.out.println("链表尾空");
            return;
        }
        //不统计头节点
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

    /**
     * 查找链表的倒数k个节点(时间复杂度 O(m+n))
     * @param head 链表的头节点
     * @param index 表示倒数第几个节点
     * @return 找到的节点
     */
    public Node GetLastIndex(Node head,int index){
        //接受head节点，和index(index表示倒数第几个节点)
        //得到链表的长度length(length-index为所找节点)
        if(head.next == null){
            return null;
        }
        //第一次遍历
        int length = GetCount(head);
        //第二次遍历，length-index位置
        if(index<0 || index>length){
            return null;
        }
        Node temp = head.next;
        for(int i = 0;i<length-index;i++){
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 反转单链表
     * @param head 链表的头节点
     */
    public void ReverseLinkedList(Node head){
        if(head.next == null || head.next.next == null){
            return;
        }
        //定义一个辅助指针，帮助遍历链表
        Node current = head.next;
        //这是一个记录下一个节点的位置
        Node next = null;
        //反转链表的头节点
        Node reverseLinkedList = new Node(0);
        while (current != null){
            //保存当前节点的下一个节点
            next = current.next;
            //将current的下一个节点指向新链表的前端
            current.next = reverseLinkedList.next;
            //将反转链表的节点指向当前节点
            reverseLinkedList.next = current;
            //完成移动之后将current后移
            current = next;
        }
        head.next = reverseLinkedList.next;
    }

    /**
     * 单链表的逆序打印
     * @param head
     */
    public void ReversePrint(Node head){
        if(head.next == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = head.next;
        while(current != null){
            stack.push(current);
            current = current.next;
        }
        //将栈中的数据出栈
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

}
