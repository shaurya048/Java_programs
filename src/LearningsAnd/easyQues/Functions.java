package LearningsAnd.easyQues;
import java.util.*;
public class Functions {
    public static void PrintName(String name){
        System.out.println(name);
    }
    public static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void fact(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number ");
        int n=sc.nextInt();
        fact(n);
    }
}
