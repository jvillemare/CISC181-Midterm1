package cisc181.midterm1;

import java.util.Comparator;

public class SortByArea extends Cuboid implements Comparator<Cuboid>  {

	public SortByArea() {
		super(0, 0, 0);
	}
	
	public int compare(Cuboid o1, Cuboid o2) {
		return o1.area() - o2.area();
	}
	
}
