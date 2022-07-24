package pertemuan10;

public class Triangle extends GeometricObject {
	private double sisi1; 
	private double sisi2; 
	private double sisi3;

	public Triangle(){
	} 

	public Triangle(double sisi1, double sisi2, double sisi3) {
		this.sisi1 = sisi1;
		this.sisi2 = sisi2;
		this.sisi3 = sisi3;
	}

	public Triangle(double sisi1, double sisi2, double sisi3, 
		String color, boolean filled) {
		this(sisi1, sisi2, sisi3);
		setColor(color);
		setFilled(filled); 
	}

	public double getsisi1() {
		return sisi1;
	}

	public void setsisi1(double sisi1) {
		this.sisi1 = sisi1;
	}

	public double getsisi2() {
		return sisi2;
	}

	public void setsisi2(double sisi2) {
		this.sisi2 = sisi2;
	}

	public double getsisi3() {
		return sisi3;
	}

	public void setsisi3(double sisi3) {
		this.sisi3 = sisi3;
	}

	@Override 
	public double getArea() {
		double s = (sisi1 + sisi2 + sisi3) / 2;
		return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
	}

	@Override 
	public double getPerimeter() {
		return sisi1 + sisi2 + sisi3;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}
