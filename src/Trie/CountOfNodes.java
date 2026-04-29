package Trie;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = right = null;
    }
}
class BinaryTree{
    static int idx =-1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int n = countNodes(root.left);
        int m = countNodes(root.right);
        return n+m+1;
    }
}
public class CountOfNodes {
    static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.countNodes(root));
    }

}
