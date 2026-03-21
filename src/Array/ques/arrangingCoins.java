package Array.ques;

public class arrangingCoins {
    public static void main(String[] args) {
        int n=10;
        int k=0,i;
        int emt=0;
        //1st way
//        for(i=1;k<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(k<=n){
//                    System.out.print(k);
//                    k++;
//                }else{
//                    System.out.print('a');
//                    emt++;
//                }
//            }
//            System.out.println();
//        }
//        if(emt==0){
//            System.out.println(i-1);
//        }else{
//            System.out.println(i-2);
//        }
//
         //2nd way
        for(i=1;k<=n;i++){
            if(n-k>=i){
                k=k+i;
            }else{
                System.out.println(i-1);
                return;
            }
        }
        System.out.println(i);
    }
}
