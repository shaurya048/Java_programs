package Trie;

public class preOrder {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTrie(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=BuildTrie(nodes);
            newNode.right=BuildTrie(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTrie(nodes);
        tree.preOrder(root);
    }
}
