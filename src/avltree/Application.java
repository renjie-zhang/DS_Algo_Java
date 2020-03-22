package avltree;

/**
 * @author: renjie.zhang
 * @date:2019/10/10-22:25
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        /*二叉树左旋
        int[] array = {4,3,6,5,7,8};
        AVLTree tree = new AVLTree();
        for (int i = 0;i<array.length;i++){
            tree.add(new Node(array[i]));
        }
        System.out.println("添加结点之后中序遍历AVLTree");
        tree.infixOrder();

        System.out.print("没有进行平衡二叉树之前，树的高度是：");
        System.out.println(tree.getRoot().currentHeight());
        System.out.println("没有进行平衡二叉树之前，左子树的高度是："+tree.getRoot().left.currentHeight());
        System.out.println("没有进行平衡二叉树之前，右子树的高度是："+tree.getRoot().right.currentHeight());*/
        /*二叉树右旋
        int[] array = {10,12,8,9,7,6};
        AVLTree tree = new AVLTree();
        for (int i = 0;i<array.length;i++){
            tree.add(new Node(array[i]));
        }
        System.out.println("添加结点之后中序遍历AVLTree");
        tree.infixOrder();
        System.out.println(tree.getRoot().currentHeight());
        System.out.println("没有进行平衡二叉树之前，左子树的高度是："+tree.getRoot().left.currentHeight());
        System.out.println("没有进行平衡二叉树之前，右子树的高度是："+tree.getRoot().right.currentHeight());*/
        int[] array = {10,11,7,6,8,9};
        AVLTree tree = new AVLTree();
        for (int i = 0;i<array.length;i++){
            tree.add(new Node(array[i]));
        }
        System.out.println("添加结点之后中序遍历AVLTree");
        tree.infixOrder();
        System.out.println(tree.getRoot().currentHeight());
        System.out.println("没有进行平衡二叉树之前，左子树的高度是："+tree.getRoot().left.currentHeight());
        System.out.println("没有进行平衡二叉树之前，右子树的高度是："+tree.getRoot().right.currentHeight());
    }
}

/*
输出：
添加结点之后中序遍历AVLTree
Node{value=3}
Node{value=4}
Node{value=5}
Node{value=6}
Node{value=7}
Node{value=8}
没有进行平衡二叉树之前，树的高度是：4
 */
