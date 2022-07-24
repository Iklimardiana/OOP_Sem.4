package pertemuan10.Latihan2;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(21, "grey", true);
        Circle circle2 = new Circle(22, "black", false);

        System.out.println("\nCircle 1: ");
        print(circle1);

        System.out.println("\nCircle 2: ");
		print(circle2);

		print("\nLingkaran terbesar dari kedua lingkaran tersebut adalah: ");
		print(Circle.max(circle1, circle2));

		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		System.out.println("\nRectangle 1: ");
		print(circle1);

		System.out.println("\nRectangle 2: ");
		print(circle2);

		print("\nPersegi terbesar dari kedua persegi tersebut adalah: ");
		print(Rectangle.max(rectangle1, rectangle2));
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(GeometricObject o) {
		System.out.println(o);
	}
}
