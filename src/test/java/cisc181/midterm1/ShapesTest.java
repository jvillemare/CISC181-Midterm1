package cisc181.midterm1;

import static org.junit.Assert.*;

import org.junit.Test;

import cisc181.midterm1.*;

public class ShapesTest {
	
	@Test
	public void rectangle_Test() {

	 	Rectangle s = new Rectangle(1, 1);

	 	assertEquals(s.area(), 1);
	 	assertTrue(s.perimeter() == 4.0);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void rectangleInvalidConstructor_Test() {

	 	Rectangle a = new Rectangle(-1, 1);
	 	Rectangle b = new Rectangle(1, -1);
	 	Rectangle c = new Rectangle(-1, -1);

	}
	
	@Test
	public void rectangleGetSet_Test() {

	 	Rectangle s = new Rectangle(1, 1);

	 	assertEquals(s.getWidth(), 1);
	 	assertEquals(s.getLength(), 1);
	 	
	 	s.setWidth(2);
	 	s.setLength(3);
	 	
	 	assertEquals(s.getWidth(), 2);
	 	assertEquals(s.getLength(), 3);

	}
	
	@Test
	public void rectangleSort_Test() {

	 	Rectangle a = new Rectangle(2, 2);
	 	Rectangle b = new Rectangle(1, 1);
	 	
	 	assertEquals(a.compareTo(b), 3);

	}
	
	@Test
	public void cuboid_Test() {

	 	Cuboid s = new Cuboid(1, 1, 1);

	 	assertEquals(s.area(), 6);
	 	assertEquals(s.volume(), 1);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void cuboidInvalidConstructor_Test() {

	 	Cuboid s = new Cuboid(1, 1, -1);

	}
	
	@Test
	public void cuboidGetSet_Test() {

		Cuboid s = new Cuboid(1, 1, 1);

	 	assertEquals(s.getDepth(), 1);
	 	
	 	s.setDepth(3);
	 	
	 	assertEquals(s.getDepth(), 3);

	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void cuboidPerimeter_Test() {

		Cuboid s = new Cuboid(1, 1, 1);
		
		s.perimeter();

	}
	
	@Test
	public void cuboidSort_Test() {

	 	Cuboid a = new Cuboid(2, 2, 2);
	 	Cuboid b = new Cuboid(1, 1, 1);
	 	
	 	assertEquals(a.compareTo(b), 18);

	}
	
	@Test
	public void cuboidComparatorArea_Test() {

	 	Cuboid a = new Cuboid(2, 2, 2);
	 	Cuboid b = new Cuboid(1, 1, 1);
	 	
	 	SortByArea sba = new SortByArea();
	 	
	 	assertEquals(sba.compare(a, b), 18);

	}
	
	@Test
	public void cuboidComparatorVolume_Test() {

		Cuboid a = new Cuboid(2, 2, 2);
	 	Cuboid b = new Cuboid(1, 1, 1);
	 	
	 	SortByVolume sbv = new SortByVolume();
	 	
	 	assertEquals(sbv.compare(a, b), 7);

	}
	
}
