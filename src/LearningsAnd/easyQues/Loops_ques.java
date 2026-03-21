package LearningsAnd.easyQues;
import java.util.*;
//sum of n natural numbers

public class Loops_ques {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
