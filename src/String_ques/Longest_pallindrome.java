package String_ques;

public class Longest_pallindrome {
    public static void main(String[] args) {
        String s="bbcc";
        char arr[] = s.toCharArray();
        int sum=0;
        int p=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(arr[i]==arr[j]){
                    arr[j]='\0';
                    count++;
                }
            }
            if(arr[i]=='\0'){
                continue;
            }
            if(count%2==0){
                sum+=count;
            }else{
                sum+=count-1;
                p++;
            }
        }
        if(p==0){
            System.out.println(sum);
            return;
        }
        System.out.println(sum+1);

    }
}
