package oop.exam6;

public class ShapeTestUpCasting {//모듈화 한 걸 하나의 method로 묶기 위해 upcasting 한 것
	public static void main(String[] args) { //반지름이나 밑변, 높이를 보기 위해서는 down casting 필요
		printArea(new Circle());
		printArea(new Rectangle());		
		printArea(new Triangle());

	}

	private static void printArea(Shape s) {
	// TODO Auto-generated method stub
		s.area();
		System.out.println("넓이는 " + s.res);
	}

}
