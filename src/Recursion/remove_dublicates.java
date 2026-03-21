package Recursion;

public class remove_dublicates {
    static boolean[] arr =  new boolean[26];
    public static void removeDub(int i,String s,String newString){
        if(i+1==s.length()){
            System.out.println(newString);
            return;
        }
        if(!arr[s.charAt(i)-'a']){
            arr[s.charAt(i)-'a']=true;
            newString=newString+s.charAt(i);
            removeDub(i+1,s,newString);
        }else{
            removeDub(i+1,s,newString);
        }
    }
    public static void main(String[] args) {
        int i=0;
        String s = "ishita";
        String newString = "";
        removeDub(i,s,newString);
    }
}
