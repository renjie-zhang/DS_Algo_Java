package binarytree;


public class Application {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node(1,"first");
        binaryTree.setRoot(root);

        Node two = new Node(2,"second");
        Node three = new Node(3,"third");
        Node four = new Node(4,"fourth");
        Node five = new Node(5,"fifth");
        Node six = new Node(6,"sixth");

        root.setLeft(three);
        root.setRight(six);
        three.setLeft(two);
        three.setRight(four);
        six.setLeft(five);

        System.out.println("前序遍历：");
        root.preOrder();

        System.out.println("中序遍历");
        root.infixOrder();

        System.out.println("后序遍历");
        root.postOrder();

    }
}

/*
输出：
    前序遍历：
    Node{no=1, name='first'}
    Node{no=3, name='third'}
    Node{no=2, name='second'}
    Node{no=4, name='fourth'}
    Node{no=6, name='sixth'}
    Node{no=5, name='fifth'}
    中序遍历
    Node{no=2, name='second'}
    Node{no=3, name='third'}
    Node{no=4, name='fourth'}
    Node{no=1, name='first'}
    Node{no=5, name='fifth'}
    Node{no=6, name='sixth'}
    后序遍历
    Node{no=2, name='second'}
    Node{no=4, name='fourth'}
    Node{no=3, name='third'}
    Node{no=5, name='fifth'}
    Node{no=6, name='sixth'}
    Node{no=1, name='first'}
 */
