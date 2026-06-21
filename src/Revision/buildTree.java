package Revision;

public class buildTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node root = new Node(nodes[idx]);
            root.left = BuildTree(nodes);
            root.right = BuildTree(nodes);
            return root;
        }
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.val);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
