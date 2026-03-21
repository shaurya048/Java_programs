package stackk;
import java.util.*;

public class Balance_2 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Brackets : ");
        String brackets=sc.next();
        int count=0;
        for(int i=0;i<brackets.length();i++){
            if(brackets.charAt(i)=='('){
                st.push(brackets.charAt(i));
            }
            if(brackets.charAt(i)==')'){
                if(st.isEmpty()){
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()||count!=0){
            System.out.println(st.size()+count);
            return;
        }
        System.out.println("Balanced");
    }
}
