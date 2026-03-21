package Array.ques;

public class missing_array2 {
    public static void main(String[] args){
        int arr[] = {8,2,4,5,3,7,1};
        int arr2[] = new int[arr.length+1];
        int j=1;
        int k=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==j){
                i=-1;
                j++;
                k++;
            }
            i++;
        }
        System.out.println(j);

    }
}
