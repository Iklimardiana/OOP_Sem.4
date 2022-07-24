/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */
import java.util.Scanner;
import java.util.Arrays;

public class Praktikum3_Anagram {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String string1 = input.nextLine();
        String string2 = input.nextLine();

        boolean status = true;
        if (string1.length() != string2.length()){
            status = false;
        } 
        else{
            char[] ArrayS1 = string1.toLowerCase().toCharArray();  
            char[] ArrayS2 = string2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }

        if (status) {
        System.out.print("anagram");
        } 
        else {
        System.out.print("not anagram");
        }
        input.close();
    }
    
}
