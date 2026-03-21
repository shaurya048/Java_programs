package Array.ques;
//nhi hua
public class Merge_sortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int arr[] = new int[nums1.length];
        int i=0,j=0,k=0;
        int n1 = 0;
        for(int a=0;a<nums1.length;a++){
            if(nums1[a]==0){
                break;
            }
            n1++;
        }
        int n2 = nums2.length;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        for(int p=0;p<arr.length;p++){
            nums1[p]=arr[p];
        }
        for(int p=0;p<arr.length;p++){
            System.out.print(nums1[p]+" ");
        }
    }
}
