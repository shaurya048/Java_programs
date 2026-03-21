package linked_listt;

public class remove_LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next= newNode;
    }
    void deleteFirst(){
        if(head == null || head.next == null){
            System.out.println("List empty");
            return;
        }
        head = head.next;
    }
    void deleteLast(){
        if(head == null || head.next == null){
            System.out.println("List empty");
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    void reverseList(){
        if(head == null || head.next == null){
            System.out.println("List empty");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    void delNode(int n){
        int size = 0;
        if(head == null || head.next == null){
            System.out.println("List empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }
        int i = 1;
        currNode = head;
        while(i < size - n){
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
    }
    void remove(int n){
        if(head == null ){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(head != null && head.data == n){
            head = head.next;
        }
        while(currNode != null){
            if(currNode.data == n){
                prevNode.next = currNode.next;
                currNode = prevNode.next;
                continue;
            }
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        remove_LL list = new remove_LL();
        list.addFirst(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(6);
//        list.addLast(4);
//        list.addLast(5);
//        list.addLast(6);
        list.remove(1);
        list.printList();
    }
}
