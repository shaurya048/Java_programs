package temps;

public class temp2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class stack{
        Node head = null;
        void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        int pop(){
            if(head==null){
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        void peek(){
            if(head==null){
                return;
            }
            System.out.println(head.data);
        }
        void display(){
            if(head==null){
                System.out.println("Stack is empty");
                return;
            }
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data+" ");
                currNode=currNode.next;
            }
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.peek();
        int x = st.pop();
        System.out.println(x);

    }
}
