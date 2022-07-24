/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args){


        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        for (int a=0; a<=n; a++){
            for (int b=0; b<=a; b++){
                System.out.print(b+ " ");
            }
            System.out.println();
        }

        for (int a=n; a>=0; a--){
            for (int b=0; b<=a; b++){
                System.out.print(b+ " ");
            }
            System.out.println();
        }

        
        for (int a=-1; a<=n; a++){
            for (int b=a; b<=n; b++){
                System.out.print("  ");
            }
            for(int c=0; c<=a; c++){
                System.out.print(c+ " ");
            }
            System.out.println();
        }

        for (int a=n; a>=0; a--){
            for (int b=a; b<=n; b++){
                System.out.print("  ");
            }
            for(int c=0; c<=a; c++){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
        input.close();
    }
}
