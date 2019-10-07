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
        tree.infixOrder();
    }
}
