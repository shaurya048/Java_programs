package OOPS;
import java.util.Scanner;

class pen{
    String name;
    String type;
    public void write(){
        System.out.println("I loveee isshuuuu");
    }
    public void nam(){
        System.out.println(name);
    }
}

class student {
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor with passed arguments
//    student (String name,int age){
//        this.name= name;
//        this.age= age;
//        info();
//    }
    //constructor wiht passed arguments not working thou
    student (){
        this.name= name;
        this.age= age;

    }
}

public class Learning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        pen p1 = new pen();
//        p1.name = sc.nextLine();
//        p1.type = "ball pen";
//        p1.nam();
//        pen p2 = new pen();
//        p2.name = sc.nextLine();
//        p2.nam();

        student s1 = new student();
        s1.name = "Shaurya";
        s1.age = 20;
        student s2 = new student();
        s2.info();
//        System.out.print("Enter your name - ");
//        s1.name=sc.nextLine();
//        System.out.print("Enter your age - ");
//        s1.age = sc.nextInt();
//        s1.info();
    }
}
