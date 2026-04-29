package Trie;

public class postOrder {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val = val;
            left = right = null;
        }
    }
    static class BinaryTree{
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
        static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" "+root.val);
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        tree.postOrder(root);
    }
}
