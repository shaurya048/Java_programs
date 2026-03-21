// car shoppp by oops
package OOPS;
import java.util.Scanner;
class CarWallah{
    Scanner sc=new Scanner(System.in);
    String colour;
    String model;
    int price;
    int budget;
    void takeinfo(){
        this.colour = sc.next();
        this.model = sc.next();
        this.price = sc.nextInt();
        this.budget = sc.nextInt();
    }
}
class ferrari extends CarWallah{
    void musicinfo(){
        System.out.println("Has apple music");
        System.out.println("Thanks for info");
    }
}
class jaquar extends CarWallah{
    void musicinfo(){
        System.out.println("Has spotify music");
        System.out.println("Thanks for info");
    }
}

public class CarShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which car you wanna buy sir ?\nFerrari or Jaquar ?");
        String c = sc.next();
        if(c.equals("Ferrari")){
            ferrari f = new ferrari();
            System.out.println("Enter colour,model,price,budget");
            f.takeinfo();
            f.musicinfo();
        }else if(c.equals("Jaquar")){
            jaquar j = new jaquar();
            System.out.println("Enter colour,model,price,budget");
            j.takeinfo();
            j.musicinfo();
        }else{
            System.out.println("Invalid input");
        }

    }
}
