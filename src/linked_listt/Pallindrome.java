package linked_listt;

public class Pallindrome {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
        }
    }
    void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    Node reverse(Node head){
        if(head==null ||  head.next==null){
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
    Node middle(Node head){
        if(head==null ||   head.next==null){
            return head;
        }
        Node turtle = head;
        Node rabbit = head;
        while(rabbit.next!=null && rabbit.next.next!=null){
            turtle=turtle.next;
            rabbit = rabbit.next.next;
        }
        return turtle;
    }
    void checkPalindrome(){
        if(head==null || head.next==null){
            System.out.println("list is palindrome");
            return;
        }
        Node currNode = head;
        Node FirstHalfLast = middle(head);
        Node secondHalfFirst = reverse(FirstHalfLast.next);
        while(secondHalfFirst!=null){
            if(secondHalfFirst.data != currNode.data){
                System.out.println("Not pallindrome");
                return;
            }
            secondHalfFirst=secondHalfFirst.next;
            currNode=currNode.next;
        }
        System.out.println("pallindrome");
    }
    public static void main(String[] args) {
        Pallindrome list = new Pallindrome();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("2");
        list.addLast("1");
        list.printList();
        list.checkPalindrome();
    }
}
