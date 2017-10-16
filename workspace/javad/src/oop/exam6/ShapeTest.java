package oop.exam6;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		System.out.println("넓이는 " + c.res);
		
		Rectangle r = new Rectangle();
		r.area();
		System.out.println("넓이는 " + r.res);
		
		Triangle t = new Triangle();
		t.area();
		System.out.println("넓이는 " + t.res);
	}

}
