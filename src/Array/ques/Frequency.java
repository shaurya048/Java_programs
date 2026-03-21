package Array.ques;
//counting frequency of numbers

public class Frequency {
    public static void main(String[] args){
        int arr[] = {3,4,5,3,2,1,0,6,2,8,0,1,9,9,6};
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]==-1){
                continue;
            }
            System.out.println("Freq of "+arr[i]+" is "+count);
        }
    }
}
