package Recursion;

public class rec_intermediate {
    public static void rev(String a,int i){
        if(i+1==a.length()){
            System.out.print(a.charAt(i));
            return;
        }
        rev(a,i+1);
        System.out.print(a.charAt(i));
    }
    static int first = 0;
    static int last = 0;
    static boolean flag = true;
    public static void occ(String s,int i){
        if(i+1==s.length()){
            System.out.println(first+" "+last);
            return;
        }
        if(s.charAt(i)=='a' && flag==true){
            first=i;
            flag=false;
        }
        if(s.charAt(i)=='a'){
            last=i;
        }
        occ(s,i+1);
    }

    public static boolean inc(int[] arr,int i){
        if(i+1==arr.length){
            return true;
        }
        if(arr[i]==arr[i+1]){
            return false;
        }
        boolean ans = inc(arr,i+1);
        return ans;
    }

    public static String sep(String og,String s1,String s2,int i){
        if(i+1==og.length()){
            if(og.charAt(i)!='x'){
                s1=s1+og.charAt(i);
            }else{
                s2=s2+og.charAt(i);
            }
            return s1+s2;
        }
        if(og.charAt(i)!='x'){
            s1=s1+og.charAt(i);
        }else{
            s2=s2+og.charAt(i);
        }
        String ans = sep(og,s1,s2,i+1);
        return ans;
    }
    static boolean[] arr = new boolean[26];
    public static void remove(int[] arr,int i){

    }
    public static void main(String[] args) {
//        String a = "abcd";
        int i=0;
//        rev(a,i);
//        String s = "abaacdaefaah";
//        occ(s,i);
//        int[] arr = {1,2,3,5,5,6};
//        System.out.println(inc(arr,i));
//        String og = "axbcxxd";
//        String s1 = "";
//        String s2 = "";
//        System.out.println(sep(og,s1,s2,i));
    }
}
