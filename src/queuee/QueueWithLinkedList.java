package queuee;

public class QueueWithLinkedList {
    static Node head;
    static Node tail;
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class queue{
        public static void push(int val){
            Node newNode = new Node(val);
            if(head == null &&  tail == null){
                head = tail = newNode;
                return;
            }
            tail.next =  newNode;
            tail = newNode;
        }
        public static void remove(){
            if(head == null && tail == null){
                System.out.println("Queue is empty");
                return;
            }
            head = head.next;
        }
        public static int peek(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public static void display(){
            if(head == null){
                System.out.println("Queue is empty");
                return;
            }
            Node currNode = head;
            while(currNode !=  null){
                System.out.print(currNode.val + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());

    }
}
