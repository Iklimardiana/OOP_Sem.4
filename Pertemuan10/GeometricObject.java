package pertemuan10;

public abstract class GeometricObject {
	private String color = "while";
	private boolean filled;

	protected GeometricObject() {
	}

	//Construct a geometric object with color and filled value
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//return color
	public String getColor() {
		return color;
	}

	// set color
	public void setColor(String color) {
		this.color = color;
	}

	//Return filled
	public boolean isFilled() {
		return filled;
	}

	// Set a new filled 
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "\ncolor: " + color +
			"\nfilled: " + filled;
	}

	//Abstract method getArea 
	public abstract double getArea();

	// Abstract method getPerimeter
	public abstract double getPerimeter();
}
