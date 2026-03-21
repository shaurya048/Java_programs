package LearningsAnd.easyQues;
import java.util.*;
//switch case in java

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for Hello\nenter 2 for Namaste\nenter 3 for bonjour");
        int n=sc.nextInt();
        switch(n){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
