package Num.Ques;

public class Climbing_stairs {
    public static void main(String[] args){
        int n=3;
        int a=0,b=1;
        int sum1=0,sum2=0;
        if(n==1){
            System.out.println(1);
            return;
        }if(n==2){
            System.out.println(2);
            return;
        } if(n==3){
            System.out.println(3);
            return;
        }
        for(int i=2;i<=n-1;i++){
            sum1=a+b;
            a=b;
            b=sum1;
        }
        int x=1,y=2;
        for(int i=2;i<=n-2;i++){
            sum2=x+y;
            x=y;
            y=sum2;
        }
        System.out.println(sum1+sum2);
    }
}
