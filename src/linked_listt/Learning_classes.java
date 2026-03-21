package linked_listt;

class Learning_classes {
    Node head;
    int size = 0 ;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add - first and last
    void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(String data){
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
    //Printing our linked list
    void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("Null\n");
    }
    //Deleting first and last
    void deleteFirst(){
        size--;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;   
    }
    void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    //reverse list
    void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            //update
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //Size of list
    int listSize(){
        return size;
    }
    public static void main(String[] args) {
        Learning_classes list = new Learning_classes();
        list.addFirst("Hello");
        list.addLast("world");
        list.addLast("Shaurya");
        System.out.println(list.listSize());
        list.printList();
        list.reverseList();
        list.printList();
    }
}
