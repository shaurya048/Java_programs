package Recursion;
// Learning recursion with basic questions
public class rec_basics {
    public static void rec1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        rec1(n-1);
    }
    public static void rec2(int n,int i){
        if(n==i){
            System.out.println(i);
            return;
        }
        System.out.println(n);
        rec2(n+1,i);
    }
    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumNum(n-1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void fib(int n,int a,int b,int i){
        if(i==n-2){
            System.out.println(a+b);
            return;
        }
        int c= a+b;
        System.out.println(c);
        fib(n,b,c,i+1);
    }
    public static int exp(int n,int x,int e){
        if(n==1){
            return e*x;
        }
        e = e*x;
        int val = exp(n-1,x,e);
        return val;
    }
    public static void main(String[] args) {
        //rec2(1,10);
        //System.out.println(sumNum(5));
        //System.out.println(fact(5));
//        int a=0,b=1;
//        System.out.println(a);
//        System.out.println(b);
//        fib(10,0,1,1);
        System.out.println(exp(5,2,1));
    }
}
