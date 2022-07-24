/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;

public class Praktikum2_Convertion_Looping {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        float result;
        Scanner input = new Scanner(System.in);
        input.close();
    
        //N:Bilangan bulat
        //M:Bilangan desimal
        int N = input.nextInt();
        float M = input.nextFloat();

        for (int i=0; i<N; i++) {
                result = (float)((M + i) * 2.2);
                System.out.printf("%.2f %.2f\n", (M +i), result);
        }
    }    
}
