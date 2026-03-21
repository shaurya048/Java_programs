package Pattern;

public class Heart {
    public static void main(String[] args) {
        for(int i=1;i<=11;i++){
            for(int j=1;j<=15;j++){
                if(j>=4-i&&j<=4+i || j>=12-i&&j<=12+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=8;i>=1;i--){
            for(int k=1;k<=8-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
