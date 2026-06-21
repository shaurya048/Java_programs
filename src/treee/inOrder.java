package treee;

public class inOrder {
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
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
    static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        tree.inOrder(tree.buildTree(nodes));
    }
}
