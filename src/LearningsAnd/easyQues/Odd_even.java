package LearningsAnd.easyQues;
import java.util.*;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        } else{
            System.out.println("odd");
        }
    }
}
