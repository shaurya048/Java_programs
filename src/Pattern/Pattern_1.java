package Pattern;


public class Pattern_1 {
    public static void main(String[] args){
        //1st question
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //2nd question
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                if(i==1||j==1||i==4||j==5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        //3rd question
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //4th question
//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //5th question
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //6th question
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //7th question
//        for(int i=5;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //8th question
//        int j=1;
//        for(int i=1;i<=5;i++){
//            for(int k=1;k<=i;k++,j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //9th question
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
