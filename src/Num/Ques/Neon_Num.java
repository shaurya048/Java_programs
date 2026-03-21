package Num.Ques;
import java.util.Scanner;
//ne9on number
public class Neon_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int m=n;
        int sum = 0;
        int sq=n*n;
        while(sq>0){
            sum = sum + sq%10;
            sq = sq/10;
        }
        if(sum==m){
            System.out.println("Neon number");
        } else{
            System.out.println("not a neon number");
        }
    }
}
