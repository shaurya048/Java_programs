package Revision;

public class LL {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    void addfirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return ;
    }
    void addlast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }
    void deletek(int k){
        if(head == null || head.next == null){
            return;
        }
        int n = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        if(n==k){
            head = head.next;
            return;
        }
        Node currNode = head;
        int i = 1;
        while(i<n-k){
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.print();
        list.deletek(2);
        list.print();
    }
}
