package BinarySearch;

public class Binarryy {
    public static void main(String[] args) {
        int arr[] = {1,1,3,3,3,5,5,5,5,7};
        int target=5;
        int first=0;
        int last=arr.length-1;
        int middle = (first+last)/2;
        while(first<=last){
            if(target<arr[middle]){
                last=middle-1;
                middle = (first+last)/2;
            }else if(target==arr[middle]){
                System.out.println(target+" Found at "+middle+" location");
                return;
            }else{
                first=middle+1;
                middle=(first+last)/2;
            }
        }
    }
}
