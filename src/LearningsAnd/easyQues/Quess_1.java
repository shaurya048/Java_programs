package LearningsAnd.easyQues;
//comparison question
import java.util.*;

public class Quess_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number(a)");
        int a=sc.nextInt();
        System.out.println("Enter second number(b)");
        int b=sc.nextInt();
        if(a>b) {
            System.out.println("A is greater than b");
        } else if(a==b){
            System.out.println("A and B are equal");
        } else {
            System.out.println("A is lesser than B");
        }

    }
}
