package Num.Ques;

public class sqrt {
    public static void main(String[] args) {
        int num = 2147395600;
        long i=1;
        while(i*i<=num){
            if(i*i==num){
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println(i-1);
    }
}
