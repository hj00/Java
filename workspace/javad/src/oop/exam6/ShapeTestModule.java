package oop.exam6;

public class ShapeTestModule {//ShapeTest를 모듈화 시킨 것.
	public static void main(String[] args){
		printArea(new Circle());
		printArea(new Rectangle());		
		printArea(new Triangle());

	}

	private static void printArea(Triangle t) {
	// TODO Auto-generated method stub
		t.area();
		System.out.println("넓이는 " + t.res);
	
}

	private static void printArea(Rectangle r) {
		r.area();
		System.out.println("넓이는 " + r.res);
	
	
}

	private static void printArea(Circle c) {
		// TODO Auto-generated method stub
		c.area();
		System.out.println("넓이는 " + c.res);
	}



}
