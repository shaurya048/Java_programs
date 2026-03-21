package linked_listt;
import java.util.*;

public class LL_Ques {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    void deleteLast(){
        if(head == null ||  head.next == null){
            return;
        }
        Node currNode = head.next;
        Node prevNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
        prevNode.next = null;
    }
    //delete nth node from end
    void deleteNode(int n){
        int m = 1,size=0;
        if(head == null || head.next == null){
            System.out.println("Null");
            return;
        }
        Node prevNode = head;
        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        if(size == n){
            deleteFirst();
            return;
        }
        while(m<size-n){
            prevNode = prevNode.next;
            m++;
        }
        prevNode.next = prevNode.next.next;
    }
    public static void main(String[] args) {
        int n =5;
        LL_Ques list = new LL_Ques();
        list.addFirst("hello");
        list.addlast("world");
        list.addlast("shaurya");
        list.addlast("verma");
        list.addlast("shawnnn");
        list.printList();
        list.deleteNode(n);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();
    }
}
