/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;

public class Pertemuan4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //PROMPT THE USER TO ENTER THREE POINTS
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //COMPUTE THREE SIDES
        double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));


        //COMPUTE THREE ANGELS
        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));


        //DISPLAY RESULTS
        System.out.print("The Results are: " + 
            Math.round(A*100)/100.0+" " + 
            Math.round(B*100)/100.0+" "+
            Math.round(C*100)/100.0);
        input.close();
    }
    
}
