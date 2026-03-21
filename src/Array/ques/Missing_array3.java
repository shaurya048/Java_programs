package Array.ques;
//missing element in array
public class Missing_array3 {
    public static void main(String[] args){
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        int arr2[] = new int[arr.length+1];
        for(int i=1;i<=arr.length;i++){
            arr2[arr[i-1]-1] = arr[i-1];
        }
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]==j+1){
                continue;
            } else{
                System.out.println(j+1);
            }
        }
    }
}
