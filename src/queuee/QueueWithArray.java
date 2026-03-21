package queuee;

public class QueueWithArray {
    static class queue{
        static int[] arr;
        static int front=-1;
        static int rear=-1;
        static int size;
        queue(int size){
            arr = new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear == size+1){
                System.out.println("Queue is full");
                return;
            }
            if(rear==-1){
                rear++;
                arr[rear] = data;
                front = 0;
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int n = arr[front];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
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
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        q.display();
//        q.remove();
//        q.display();
        System.out.println(q.peek());
    }
}
