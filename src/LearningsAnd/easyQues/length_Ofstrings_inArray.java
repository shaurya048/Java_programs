package LearningsAnd.easyQues;
import java.util.Scanner;

public class length_Ofstrings_inArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of string array : ");
        int n=sc.nextInt();
        String arr[] = new String[n+1];
        int sum=0;
        System.out.println("Enter your elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
            sum=sum+arr[i].length();
        }
        System.out.println(sum);
    }
}
