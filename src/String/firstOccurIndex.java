package String;
import java.util.Scanner;

public class firstOccurIndex {
    int strStr(String haystack, String needle) {
        int i = 0;
        if(haystack.equals(needle)){
            return 0 ;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        if(needle.length()==1){
            for(int k=0;k<haystack.length();k++){
                if(needle.charAt(0)==haystack.charAt(k)){
                    return k ;
                }
            }
        }
        while(i+needle.length()<=haystack.length()){
            String part = haystack.substring(i,i+needle.length());
            if(needle.equals(part)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter haystack : ");
        String haystack = sc.next();
        System.out.println("enter needle : ");
        String needle = sc.next();
//        int i = strStr(haystack,needle);
//        System.out.println(i);
    }
}
