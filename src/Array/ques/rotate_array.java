package Array.ques;

public class rotate_array {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        int temp=arr[0];
        for(int i=1,j=2;i<4;i++,j++){
            arr[i-1]=arr[i];
            arr[i]=arr[j];
        }
        arr[4]=temp;
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
