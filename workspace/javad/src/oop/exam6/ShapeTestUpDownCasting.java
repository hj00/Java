package oop.exam6;

public class ShapeTestUpDownCasting {
	public static void main(String[] args) { //반지름이나 밑변, 높이를 보기 위해서는 down casting 필요
		printArea(new Circle());
		printArea(new Rectangle());		
		printArea(new Triangle());

	}

	private static void printArea(Shape s) {
	// TODO Auto-generated method stub
		s.area(); //instanceof : Circle type으로 downcasting 할 수 있는지 확인 할 수 있는 함수.기능?
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res);
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("밑변이 " + r.w + "이고, 높이가 " + r.h + "인 사각형의 넓이는 " + s.res);
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("밑변이 " + t.w + "이고, 높이가 " + t.h + "인 삼각형의 넓이는 " + t.res);
		}

	}

}
