package Array.ques;
import java.util.*;
//reversing our only array
public class reverse_array2 {
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
        int temp;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        System.out.print("Reversed array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
