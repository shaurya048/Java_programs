package linked_listt;
import java.util.*;

public class LL_collectionFramework {
    public static void main (String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");
    }
}
