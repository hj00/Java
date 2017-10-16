package oop.exam7;

public class Point2D {
	int x;
	int y;
	public Point2D(){
		/*
		x = 1;
		y = 1; default 를 1로 쓰고 싶은 경우 이런 방식은 별로 추천하지 않음.
		*/ 
		this(1, 1); //생성자에서 또다른 생성자를 호출하는 것. 생성자 오버로딩
		System.out.println("Point2D()");
		//생성자에서 다시 생성자를 호출할 때(생성자 오버로딩시?) 가장 먼저 수행되어야 함.
		//this(1,1)과 System.out.println의 순서를 바꿔서 입력하면 에러.
	};
	public Point2D(int x, int y) { // 값을 받을 형식으로 생성자를 만들어줬다면
		                           //Point2D pt = new Point2D();가 error남.
		                           //왜냐면 이걸 생성함으로써 반드시 두 개의 초기값을 받아야 한다고 JVM이 인식함.
		                           //그러므로 위와같은 public Point2D(){} 를 반드시 만들어 주는게 좋음.
		                           //기존의 초기값을 받지 않는 코드들이 error 나지 않도록.
		super(); //만약에 Point2D가 상속받은 다른 클래스가 있을 때, 
		         //super class의 생성자를 수행하고 다시 돌아오게 하는 것.
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y)");
	}
	
}
