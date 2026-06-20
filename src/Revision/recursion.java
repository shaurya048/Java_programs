package Revision;

public class recursion {
    public static void factorial(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        factorial(n-1,fact);
    }
    public static void main(String[] args) {
        factorial(5,1);
    }
}
