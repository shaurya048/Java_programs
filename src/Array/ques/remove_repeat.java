package Array.ques;

public class remove_repeat {
    public static void main(String args[]){
        int arr[] = {1,1,2};
        int a[] = new int[arr.length];
        int k=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1 || arr[i]!=arr[i+1]){
                a[k]=arr[i];
                count++;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(count);
    }
}
