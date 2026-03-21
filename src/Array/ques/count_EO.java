package Array.ques;

public class count_EO {
    public static void main(String[] args){
        int arr[] = {3,4,5,3,2,1,0,0,2,8,0,1,9,9,6};
        int even=0;
        int odd=0;
        for(int i=0;i<15;i++){
            if(arr[i]%2==0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.print("even numbers = "+even+"\nodd numbers = "+ odd);
    }
}
