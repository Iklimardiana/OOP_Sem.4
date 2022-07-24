

import java.util.Scanner;

public class Praktikum2_DefineMonth {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        input.close();
                int number = input.nextInt();
                switch(number){
                    case 1:
                    System.out.println("January");
                    break;
                    case 2:
                    System.out.println("February");
                    break;
                    case 3:
                    System.out.println("March");
                    break;
                    case 4:
                    System.out.println("April");
                    break;
                    case 5:
                    System.out.println("May");
                    break;   
                    case 6:
                    System.out.println("June");
                    break;
                    case 7:
                    System.out.print("July");
                    break;
                    case 8:
                    System.out.print("August");
                    break;
                    case 9:
                    System.out.print("September");
                    break;
                    case 10:
                    System.out.print("October");
                    break;
                    case 11:
                    System.out.print("November");
                    break;
                    case 12:
                    System.out.print("Desember");
                    break;
                    default :
                    System.out.print("Input Error");

                }
    }
}
