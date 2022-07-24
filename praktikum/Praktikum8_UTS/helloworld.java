/*Buatlah sebuah program dasar dalam java yang akan menerima input sebuah kata dan mengeluarkan sapaan "Selamat datang" sebagai output program. */

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println("Selamat datang"+" "+(a)+"!");
    }
}
