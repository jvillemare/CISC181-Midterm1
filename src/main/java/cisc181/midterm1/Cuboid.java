package cisc181.midterm1;

public class Cuboid extends Rectangle implements Comparable<Object> {

	private int depth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		
		if(depth < 0)
			throw new IllegalArgumentException("No negative values.");
		
		this.depth = depth;
	}

	public int getDepth() {
		return this.depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int volume() {
		return super.width * super.length * this.depth;
	}

	@Override
	public int area() {
		return super.area() * 6;
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Object o) {
		Cuboid other = (Cuboid)o;
		
		return this.area() - other.area();
	}
	

}
