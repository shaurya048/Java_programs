package Array.ques;

//re-write it
public class Array_merge {
    public static void main(String[] args){
        int arr1[]={2,8,10,15,20};
        int arr2[]={3,5,9,12,14};
        int arr3[]= new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<5 && j<5){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            } else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        for(i=i;i<5;i++){
            arr3[k]=arr1[i];
            k++;
        }
        for(j=j;j<5;j++){
            arr3[k]=arr1[j];
            k++;
        }
        for(int r=0;r<10;r++){
            System.out.print(arr3[r]+" ");
        }

    }

}
