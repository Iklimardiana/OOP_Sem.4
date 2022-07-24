/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */

import java.util.Scanner;
public class praktikum3 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        String[] country = new String[50];
        
        int n = input.nextInt();
        int i,j;
        
        if(n>=0 && n<50){
            for(i=0; i<=n; i++){
                country[i] = input.nextLine();
            }
            
            for(i=0; i<n; i++){  
                for (j=i+1; j<=n; j++){
                    if(country[i].compareTo(country[j])>0){
                        String temp = country[i];  
                        country[i] = country[j];  
                        country[j] = temp;  
                    }  
                }  
            }

            for (i=1; i<=n; i++) {
                System.out.println(country[i]);
            }
        }
       
    }

    
}
