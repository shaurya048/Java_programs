package stackk;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        System.out.println("Enter the Brackets : ");
        Scanner sc=new Scanner(System.in);
        String brackets = sc.next();
        if(brackets.length()%2!=0||brackets.length()==0){
            System.out.println("Not balanced");
            return;
        }
        for(int i=0;i<brackets.length();i++){
            if(brackets.charAt(i)=='('){
                st.push(brackets.charAt(i));
            }
            if(brackets.charAt(i)==')'){
                if(st.isEmpty()){
                    System.out.println("Not balanced");
                    return;
                }else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("Not balanced");
        }
    }
}
