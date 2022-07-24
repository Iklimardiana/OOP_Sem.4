/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;

public class Praktikum2_NumbOfDay {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            input.close();
            int M = input.nextInt();
            int Y = input.nextInt();
            int numbOfDays = 0; 
            System.out.print("");

            switch (M){
                case 1:
                numbOfDays = 31;
                break;
            case 2:
                if ((Y % 400 == 0 || (Y % 4 == 0) && (Y % 100 != 0))) {
                    numbOfDays = 29 ;
                  }
                else{
                    numbOfDays = 28;
                }
                break; 
            case 3:
                numbOfDays = 31;
                break;
            case 4:
                numbOfDays = 30;;
                break;
            case 5:
                numbOfDays = 31;;
                break;
            case 6:
                numbOfDays = 30;;
                break;
            case 7:
                numbOfDays = 31;;
                break;
            case 8:
                numbOfDays = 31;
                break;
            case 9:
                numbOfDays = 30;
                break;
            case 10:
                numbOfDays = 31;
                break;
            case 11:
                numbOfDays = 30;
                break;
            case 12:
                numbOfDays = 31;
                break;
            }
            System.out.print(numbOfDays);
    }
}
