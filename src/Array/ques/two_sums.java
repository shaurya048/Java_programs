package Array.ques;
//Two sum problem
public class two_sums {
    public static void main(String[] args) {
        int nums[] = {4,8,2,5,3,6};
        int target=9;
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
