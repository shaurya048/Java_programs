package Array.ques;
import java.util.*;
//storing reverse in new array
public class reverse_array {
    public static void main(String[] args){
        System.out.println("Enter the length of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[]=new int[n];
        for(int i=0,j=n-1;i<n;i++,j--){
            arr2[i]=arr[j];
        }
        System.out.print("Reversed array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
