package pertemuan10.Latihan2;


public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
	private boolean filled;

	/** Construct a default geometric object */
	protected GeometricObject() {
	}

    	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */

	@Override
	public String toString() {
		return "\nWarna: " + color +
			"\nfilled: " + filled;
	}

	@Override
	public int compareTo(GeometricObject object){
		if(this.getArea()>object.getArea()){
			return 1;
		}
		else if (this.getArea() > object.getArea()){
			return -1;
		}	
		else{
			return 0;
		}
			
	}

	public static GeometricObject max(GeometricObject object1, GeometricObject object2){
		return object1.compareTo(object2)==1? object1:object2;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

}
