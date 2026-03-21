package stackk;
import java.util.*;
//Learning from collection frame work
public class StackInbuild {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        System.out.println(st.peek());
    }
}
