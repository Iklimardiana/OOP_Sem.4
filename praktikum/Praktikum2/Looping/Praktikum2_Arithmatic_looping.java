/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iklima Mardiana
 */

import java.util.Scanner;

public class Praktikum2_Arithmatic_looping {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a, b = 0, c = 0;
        double Average;
                Scanner x= new Scanner(System.in);

               do {
                    a = x.nextInt();
                    if(a > 0){
                        b = a + b;
                        c++;
                    }

                }while(a != 0);

                    x.close();

                if(c == 0){
                    c++;
                }

                Average = (double)b/c;

                System.out.println(b);
                System.out.printf("%.1f", Average);

    }
}
