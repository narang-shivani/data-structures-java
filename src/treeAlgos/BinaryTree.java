package treeAlgos;

public class BinaryTree {
    Node root;
    public static void main (String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);
    }
    static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }
    static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.key);
        inOrder(node.right);
    }
    static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key);
    }
}
