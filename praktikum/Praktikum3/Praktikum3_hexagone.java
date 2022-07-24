/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;


public class Praktikum3_hexagone {
    public static void main (String[] args){
    double area;
    Scanner input = new Scanner(System.in);

    double s = input.nextDouble();
    area = (6*((s*s))/(4*Math.tan(Math.PI/6)));

    input.close();
    System.out.printf("%.2f\n",area);

    }
}
