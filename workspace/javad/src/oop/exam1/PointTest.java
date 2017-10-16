package oop.exam1;

public class PointTest {
	public static void main(String[] args) {
		//new Point2D(); // 메모리에 실체가 생성됨. -- 메모리에 instance가 생성됨.
		//Point2D pt = new Point2D(); //pt : instance 참조명(참조변수)
		//class 를 이용해서 instance를 생성하고 참조변수를 만들어줌?
		
		new Point3D();
		Point3D pt = new Point3D();
		
		/*
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());
		*/
		
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		pt.print();

	}

}
