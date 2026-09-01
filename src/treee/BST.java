package treee;

public class BST {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val < val){
            root.right = buildBST(root.right, val);
        }else{
            root.left = buildBST(root.left, val);
        }
        return root;
    }
    public static void printBST(Node root){
        if(root == null){
            return;
        }
        printBST(root.left);
        System.out.print(root.val + " ");
        printBST(root.right);
    }
    public static void main(String[] args) {
        int[] BST = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < BST.length; i++){
            root = buildBST(root, BST[i]);
        }
        printBST(root);
    }
}
