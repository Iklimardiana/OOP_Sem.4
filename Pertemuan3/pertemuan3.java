/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PRIVATE-PC
 */

// import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] args){
//    int a, b;
//    a = 30;
//    b = 20;
//
//    if (a==b){
//        System.out.println ("Nilai a sama dengan b");
//    }
//    else {
//        System.out.println("Nilai tidak sama dengan b");
//    }
//
//    System.out.println(a==b);
//    System.out.println (a!=b);
//    System.out.println (a>b);
//    System.out.println (a<b);


//        String kataSatu, kataDua;
//        kataSatu = "Hallo";
//        kataDua = "Hallo";

//        if(kataSatu == kataDua){
//            System.out.println("Nilai sama");
//        }
//        else{
//            System.out.println("Nilai beda");
//        }
//
//        if(kataSatu.equals(kataDua)){
//            System.out.println("Nilai sama");
//        }
//        else{
//            System.out.println("Nilai beda");
//        }

//  int a,b,c,d;
//        a = 10;
//        b = 20;
//        c = 30;
//        d = 40;
//
//        if((a==b) && (b!=c) && (d>=c)){
//            System.out.println("Nilai sama");
//        }
//        else{
//            System.out.println("Nilai beda");
//        }
//    }


//        boolean kelulusan = true;
//        int nilaiGrade = 95;
//        if ((kelulusan==true) && (nilaiGrade>=90)){
//            System.out.println("Anda lulus cumlaude");
//        }
//        else{
//            System.out.println("Anda lulus, tapi Tidak cumlaude");
//        }


// if bersarang
//        double income = 30000, tax;
//        if (income <=15000)
//        {
//            tax = 0;
//        }
//        else if (income <= 25000)
//        {
//            tax = 0.05 * (income-15000);
//        }
//        else 
//        {
//            tax = 0.05 * (income-(25000-15000));
//            tax += 0.10 * (income - 25000);
//        }//endif

//        System.out.println(tax


//switch case

//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan Nilai Anda : ");
//        int nilai = input.nextInt();
//        switch(nilai){
//            case 100:
//            System.out.println("Lulus sangat memuaskan");
//            break;
//            case 90:
//            System.out.println("Lulus cukup Memuaskan");
//            break;
//            case 80:
//            System.out.println("Lulus sangat Memuaskan");
//            break;
//            case 70:
//            System.out.println("Lulus sangat Baik");
//            break;
//            case 60:
//            System.out.println("Lulus cukup baik");
//            break;   
//            case 50:
//            System.out.println("Tidak lulus");
//            break;
//        }

        System.out.println("looping for");
                for (int i = 0; i<=10;i++){
                if(i==3)
                {
                break;
                }
                System.out.println(i);
            }
                System.out.println("while loop");
                int a=0;
                while (a<=10){
                System.out.println(a);
                a++;
                if(a==5)
                {
                break;
                }
            }
                System.out.println("do while loop");
                int b=0;
            do{
                System.out.println(b);
                b++;
                if(b==3)
                {
                break;
                }
            }while (b<=10);

    }

}
