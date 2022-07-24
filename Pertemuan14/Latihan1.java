import java.util.LinkedList;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        double jumlah = input.nextDouble();

        try {
            LinkedList<Double> list = new LinkedList<Double>();
            for (int i = 0; i < jumlah; i++) {
                list.add(input.nextDouble());
            }

            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 != 0) {
                    System.out.print((i + 1) + ","+" ");
                }
            }
            System.out.print("]");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



// import java.util.Scanner;

// public class Latihan1 {
//     public static void main(String[] args) {
//         int n;
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Masukkan jumlah elemen: ");
//         n = scan.nextInt();

//         int[] array = new int[10];
//         System.out.println("Masukkan angka: ");

//         for(int i=0; i<n; i++){
//             array[i] = scan.nextInt();
//         }

//         System.out.println("Deret Bilangan Ganjil: ");

//         for(int i=0; i<n; i++){
//             System.out.println(array[i]);
//         }
//     }
// }
