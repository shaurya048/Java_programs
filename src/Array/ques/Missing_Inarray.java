package Array.ques;
//finding missing number in array

public class Missing_Inarray {
    public static void main(String[] args){
        int arr[] = {8,2,4,5,3,7,1};
        int p=0;
        for(int i=1;i<=arr.length + 1;i++){
            for(int j=0;j<arr.length;j++){
                p=0;
                if(arr[j]==i){
                    p++;
                    break;
                }
            }
            if(p==0){
                System.out.println(i);
            }
        }
    }
}
