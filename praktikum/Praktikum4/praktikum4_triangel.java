import java.util.Scanner;

public class praktikum4_triangel {
    public static void displayPattern(int n){
        // for (int i = 1; i <= n; ++i) {
        //     for (int j = 1; j <= i; ++j) {
        //       System.out.print(j + " ");
        //     }
        //     System.out.println();
        //   }

        // for (int i=1; i<=n; i++) {
        //     for (int j=n; j>=i; j--) {
        //          System.out.print("  ");
        //      }for (int k=i; k>=1; k--) {
        //          System.out.print(k);
        //      }System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
        displayPattern(n);
        input.close();
    }
}
