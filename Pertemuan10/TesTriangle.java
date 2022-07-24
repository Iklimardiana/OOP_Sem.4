package pertemuan10;
import java.util.Scanner;


public class TesTriangle {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan ketiga sisi segitiga (cm): ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Masukkan warna: ");
		String color = input.next();

		System.out.print("Apakah segitiga terisi(true / false)? ");
		boolean filled = input.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		System.out.println(triangle);
        input.close();
	}
}
