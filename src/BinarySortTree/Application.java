package io.renjiezhang.BinarySortTree;

/**
 * @author: renjie.zhang
 * @date:2019/10/7-21:11
 * @Description: main method
 */
public class Application {
    public static void main(String[] args) {
        int[] array = {7,3,10,12,5,1,9};
        BinarySortTree tree = new BinarySortTree();
        for (int i = 0; i < array.length; i++) {
            tree.add(new Node(array[i]));
        }
        System.out.println("binary tree print out");
        /*Node n1 = new Node(5);
        tree.deleteNode(n1);*/
        Node n2 = new Node(10);
        tree.deleteNode(n2);
        tree.infixOrder();
    }
}
/*
输出
binary tree print out
Node{value=1}
Node{value=3}
Node{value=5}
Node{value=7}
Node{value=9}
Node{value=12}
 */
