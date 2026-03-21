package stackk;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse stack in another stack
        Stack <Integer> st2 = new Stack();
        int n = st.size();
        for(int i=0;i<n;i++){
            int x = st.pop();
            st2.push(x);
        }
        System.out.println(st2);
        //reversing to original
        Stack <Integer> st3 = new Stack();
        int m = st2.size();
        for(int i=0;i<m;i++){
            int x = st2.pop();
            st3.push(x);
        }
        System.out.println(st3);
    }
}
