package io.renjiezhang.LinkedList;

/**
 * @ClassName renjiezhang.LinkedList.APP
 * @Description
 * @Author joker
 * @Date 2019/8/15 16:52
 */
public class Application {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        LinkedList.Node NodeTwo = new LinkedList.Node(2);
        LinkedList.Node NodeThree = new LinkedList.Node(3);
         /* Three nodes have been allocated dynamically.
          We have references to these three blocks as first ,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */
        list.head.next = NodeTwo;
        /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */
        NodeTwo.next = NodeThree;
        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        list.printList();
    }
}
