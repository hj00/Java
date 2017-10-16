package oop.exam7;

public class PointTest {
	public static void main(String[] args) {
		
		// 만약 Point2D라는 클래스안에 생성자가 없다면 
		// public Point2D(){} 와 같은 껍데기만 있는 
		// default constructor를 생성해줌(JVM이) Point2D pt = new Point2D();에 대해
		/*
		Point2D pt1 = new Point2D();
		System.out.println("x = " + pt1.x);
		System.out.println("y = " + pt1.x);

		
		Point2D pt2 = new Point2D(100,200); 
		
		System.out.println("x = " + pt2.x);
		System.out.println("y = " + pt2.y);
		*/
		
		Point3D pt3 = new Point3D();
		System.out.println("x = " + pt3.x);
		System.out.println("y = " + pt3.y);
		System.out.println("z = " + pt3.z);
		
		
//		Point3D pt4 = new Point3D(1, 2, 3);
//		System.out.println("x = " + pt4.x);
//		System.out.println("y = " + pt4.y);
//		System.out.println("z = " + pt4.z);
		
	}

}
