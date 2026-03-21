package stackk;
import java.util.Stack;
import java.util.Scanner;

public class InsertAtAny {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Enter the position");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> rt = new Stack();
        for(int i=0;i<n-1;i++){
            rt.push(st.pop());
        }
        System.out.println(rt);
        System.out.println("Enter the value");
        int v = sc.nextInt();
        st.push(v);
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
