package Recursion;
//All possible permutations of a string
//solution is of n! time complexity
public class rec_advance {
    public static void perm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char Curr = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            perm(newstr,permutation+Curr);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        perm(s,"");
    }
}
