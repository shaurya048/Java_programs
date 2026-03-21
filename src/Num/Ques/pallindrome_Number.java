package Num.Ques;

import java.util.Scanner;

public class pallindrome_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x = n;
        int rev = 0;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        System.out.println(rev);
        if(rev==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
