package Array.ques;

public class Frequency2 {
    public static void main(String[] args){
        int arr[] = {3,4,5,3,2,1,0,6,2,8,0,1,9,9,6};
        int arr2[] = new int[arr.length];
        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==j){
                arr2[j]=j;
                count++;
            }
        }
    }
}
