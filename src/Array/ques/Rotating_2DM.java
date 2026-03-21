package Array.ques;

public class Rotating_2DM {
    public static void main(String[] args) {
        int a1[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int a2[][] = new int[a1.length][a1[0].length];
        int n= a1.length;
        int m = a1[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a2[j][n-i-1] =  a1[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
