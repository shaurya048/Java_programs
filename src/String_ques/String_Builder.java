package String_ques;
import java.util.Scanner;
//reverse of stringBUilder

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        StringBuilder sb = new StringBuilder(sc.next());
        for(int i=0,j=sb.length()-1;i<sb.length()/2;i++,j--){
            char temp =  sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
        }
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
    }
}
