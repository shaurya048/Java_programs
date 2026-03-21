package queuee;

public class QueueWithCircularArray {
    static class queue{
        static int[] arr;
        static int size;
        static int front = -1;
        static int rear = -1;
        queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                rear = (rear+1)%size;
                arr[rear] = data;
                front = rear;
                return;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
    }
}
