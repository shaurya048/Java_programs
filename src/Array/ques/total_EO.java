package Array.ques;
//sum of even indexes and odd indexes
public class total_EO {
    public static void main(String[] args){
        int arr[] = {3,4,5,3,2,1,0,6,2,8,0,1,9,9,6};
        int Oddsum=0;
        int Evensum=0;
        for(int i=0;i<15;i++){
            if(arr[i]%2==0){
                Evensum=Evensum+arr[i];
            } else{
                Oddsum=Oddsum+arr[i];
            }
        }
        System.out.println(Evensum);
        System.out.println(Oddsum);
    }
}
