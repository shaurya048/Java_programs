package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer> ();
        System.out.println("Enter some inegers : ");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.add(2,6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
    }
}
