package io.renjiezhang.BinarySortTree;

/**
 * @author: renjie.zhang
 * @date:2019/10/7-21:01
 * @Description: 二叉排序树
 */
public class BinarySortTree {

    private Node root;
    /**
     *
     * @param node
     */
    public void add(Node node){
        if(root == null){
            root = node;
        }else {
            root.addNode(node);
        }
    }

    public void infixOrder(){
        if(root == null){
            System.out.println("binary tree is null");
        }else {
            root.infixOrder();
        }
    }
}

