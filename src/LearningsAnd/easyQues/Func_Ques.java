package LearningsAnd.easyQues;
import java.util.*;

public class Func_Ques {
    public static void fib(int n){
        int a=0,b=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
        }
    }
    public static void factor(int a,int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        int gcf=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0 && b%i==0){
                gcf=i;
            }
        }
        System.out.println(gcf);
    }
    public static void power(int n,int x){
        int y=x;
        for(int i=1;i<n;i++){
            x=x*y;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n and x : ");
        int n=sc.nextInt();
        int x=sc.nextInt();
        power(n,x);
//        System.out.println("Enter a and b : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        factor(a,b);
//        System.out.println("Enter your number");
//        int n = sc.nextInt();
//        fib(n);
    }
}
