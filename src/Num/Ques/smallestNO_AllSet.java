package Num.Ques;
import java.util.Scanner;

public class smallestNO_AllSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        double num=0;
        int arr[] = new int[1000];
        int i=0;
        while(n>0){
            arr[i]= n%2;
            n=n/2;
            i++;
        }
        int k=0;
        for(int j=i-1;j>=0;j--){
            if(arr[j]==0){
                arr[j] = 1;
            }
            num +=arr[j]*Math.pow(2,k);
            k++;
        }
        System.out.println(num);
    }
}
