package String_ques;
//Finding Anagrams

public class anangrams {
    public static void main(String[] args){
        String s1="bbbb";
        String s2="bb";
        int arr[] = new int[123];
        if(s1.length()!=s2.length()){
            System.out.println("False");
            return;
        }
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)]--;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
