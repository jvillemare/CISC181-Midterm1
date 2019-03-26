package cisc181.midterm1;

public class Rectangle extends Shape implements Comparable<Object> {

	protected int width;
	protected int length;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Rectangle(int width, int length) {
		if(width < 0 || length < 0)
			throw new IllegalArgumentException("No negative values");
		
		this.width = width;
		this.length = length;
	}
	
	@Override
	public int area() {
		return this.width * this.length;
	}

	@Override
	public double perimeter() {
		return (this.width * 2.0) + (this.length * 2.0);
	}

	public int compareTo(Object o) {
		Rectangle other = (Rectangle)o;
		
		return this.area() - other.area();
	}
	
}
