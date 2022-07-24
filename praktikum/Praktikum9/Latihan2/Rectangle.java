package Praktikum.Praktikum9.Latihan2;

public class Rectangle extends GeometricObject{
    private double Lebar;
	private double Tinggi;

	public Rectangle() {
	}

	public Rectangle(
		double Lebar, double Tinggi) {
		this.Lebar = Lebar;
		this.Tinggi = Tinggi;
	}

	public Rectangle(
		double Lebar, double Tinggi, String color, boolean filled) {
		this.Lebar = Lebar;
		this.Tinggi = Tinggi;
		setColor(color);
		setFilled(filled);
	}

	/** Return Lebar */
	public double getLebar() {
		return Lebar;
	}

	/** Set a new Lebar */
	public void setLebar(double Lebar) {
		this. Lebar = Lebar;
	}

	/** Return Tinggi */
	public double getTinggi() {
		return Tinggi;
	}

	/** Set a new Tinggi */
	public void setTinggi(double Tinggi) {
		this.Tinggi = Tinggi;
	}

	@Override /** Return area */
	public double getArea() {
		return Lebar * Tinggi;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (Lebar * Tinggi);
	}

	@Override /** Return String discription of this rectangle */
	public String toString() {
		return super.toString() + "\nLebar: " + Lebar + "\nTinggi: " + Tinggi
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

}
