package Array.ques;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int target = 2;
        int nums[] = {1,3,5,6};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
                return;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(target<nums[i]){
                System.out.println(i);
                return;
            }
        }
    }
}
