package Num.Ques;
import java.util.*;

public class Amstrong {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n=sc.nextInt();
        int n1=n;
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        double sum=0;
        int m;
        while(n1>0){
            m=n1%10;
            sum=sum+ Math.pow(m,c);
            n1=n1/10;
        }
        System.out.println(sum);
    }
}
