package linked_listt;

public class LL_Ques2 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
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
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("NULL\n");
    }
    void reverseList(){
        if(head==null ||  head.next==null){
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
    //Pallindrome checking function
    void checkPallindrome(){;
        if(head==null ||   head.next==null){
            System.out.println("List is Pallindrome");
        }
        Node currNode = head;
        String sum = null;
        while(currNode != null){
            sum = sum + currNode.data;
            currNode=currNode.next;
        }
        reverseList();
        String sum2 = null;
        Node pointer = head;
        while(pointer!=null){
            sum2=sum2+pointer.data;
            pointer=pointer.next;
        }
        if(sum.equals(sum2)){
            System.out.println("Pallindrome list");
            return;
        }
        System.out.println("List is not Pallindrome");
    }
    //Finding middle element of linked list
    int findMiddle(){
        int size = 1;
        if(head==null||head.next==null){
            return 0;
        }
        Node rabbit = head;
        Node turtle = head;
        while(rabbit.next != null && rabbit.next.next != null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;
            size++;
        }
        System.out.println("Middle index is : "+size+" and element is : "+turtle.data);
        return size;
    }
    public static void main(String[] args) {
        LL_Ques2 list = new LL_Ques2();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("1");
        list.printList();
        list.findMiddle();
    }
}
