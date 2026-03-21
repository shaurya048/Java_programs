package Array.ques;

public class second_largest {
    public static void main(String[] args){
        int arr[] = {10,50,8,9,21,60};
        int max=arr[0];
        int temp=0;
        for(int i=1;i<6;i++){
            if(max<arr[i]){
                temp=max;
                max=arr[i];
            }
        }
        System.out.println(temp);
    }
}
