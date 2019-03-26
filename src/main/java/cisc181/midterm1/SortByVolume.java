package cisc181.midterm1;

import java.util.Comparator;

public class SortByVolume extends Cuboid implements Comparator<Cuboid> {

	public SortByVolume() {
		super(0, 0, 0);
	}
	
	public int compare(Cuboid o1, Cuboid o2) {
		return o1.volume() - o2.volume();
	}
	
}
