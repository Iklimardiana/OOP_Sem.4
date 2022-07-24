/*Buatlah sebuah program yang akan menerima input berupa bilangan bulat A dan menghitung sisa bagi bilangan i terhadap bilangan A.
 Bilangan i adalah bilangan bulat dari 1 sampai 10. */

import java.util.Scanner;

public class sisabagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        int i;
        if (a>=1 && a<=10){
            for (i=1; i<=10; i++){
                System.out.println("Sisa bagi untuk "+ i +" "+"adalah "+i%a);
            }
        }
    }
}
