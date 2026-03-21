package stackk;

public class StackLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        void push(int val){
            Node newNode = new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        int pop(){
            if(head==null){
                return -1;
            }
            int x =  head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if(head==null){
                return -1;
            }
            return head.val;
        }
        void display(){
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.val+" ");
                currNode=currNode.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
