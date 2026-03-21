package stackk;

public class Learning {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static class stack{
        public Node head;
        boolean isEmpty(){
            return head==null;
        }
        void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        void peek(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return;
            }
            int currNode = head.data;
            System.out.println(currNode);
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }
    }
}
