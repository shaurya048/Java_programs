package treee;

import java.util.LinkedList;
import java.util.Queue;

public class lvlOrder {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }
    static void lvlorder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();

            if(curr == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.val + " ");

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        lvlorder(tree.buildTree(nodes));
    }
}
