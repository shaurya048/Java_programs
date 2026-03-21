package stackk;

public class StackArray {
    public static class Stack{
        int[] arr = new int[5];
        int top = -1;
        void push(int n){
            arr[top+1] = n;
            top++;
        }
        int pop(){
            int i = arr[top];
            arr[top] =  0;
            top--;
            return i;
        }
        int peek(){
            return arr[top];
        }
        boolean isEmpty(){
            if(top==-1){
                return false;
            }
            return true;
        }
        boolean isFull(){
            return top == arr.length-1;
        }
        void display(){
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.pop();
        System.out.println();
        st.display();
        System.out.println("\n"+ st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
