package LearningsAnd.easyQues;
import java.util.Scanner;
//table printing by loops
public class Table_byLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number for table");
        int n = input.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.print(i*n+" ");
        }

    }
}
