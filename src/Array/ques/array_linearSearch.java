package Array.ques;
import java.util.*;
//Linear search and understanding arrays in java

public class array_linearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The size of array : ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element : ");
        int search=sc.nextInt();
        int found=0;
        for(int i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println("Element found at index : "+i);
                found++;
                break;
            }
        }
        if(found==0){
            System.out.println("Element not found");
        }
    }
}
