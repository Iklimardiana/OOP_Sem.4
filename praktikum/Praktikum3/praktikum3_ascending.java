/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */

import java.util.Scanner;

public class praktikum3_ascending {
    public static void main(String args[]){
  int n;
        Scanner ky = new Scanner(System.in);
        String sc1, sc2;
        n = ky.nextInt();
        
        if(n >= 0 && n < 50){
            String[] namaNegara = new String[n];
            
            // input nama negara
            for(int i = 0; i< n ;i++){
                namaNegara[i] = ky.next();
            }
            
            // close
            ky.close();
            
            // urutkan
          
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < namaNegara.length; j++){
                        sc1 = namaNegara[i].toLowerCase();
                        sc2 = namaNegara[j].toLowerCase();
                            if(sc1.compareTo(sc2) > 0){
                                String temp = namaNegara[i];
                                namaNegara[i] = namaNegara[j];
                                namaNegara[j] = temp;
                            }
                }
            }
           
           
            // tampilkan
            for(int i = 0; i < n; i++){
                System.out.println(namaNegara[i]);
            }
        }
    }   
}
