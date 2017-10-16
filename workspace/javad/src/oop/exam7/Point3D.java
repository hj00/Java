package oop.exam7;

public class Point3D extends Point2D {
	int z;
	
	/*
	public Point3D(){
		super();//접근 제어자는 클래스 의 접근제어자를 따라감. public -> public, private -> private
	} int z만 존재할 뿐 파라미터가 없는 생성자가 수행된 경우 JVM 컴파일러가 내부에서 자동 수행하는 것.
	*/
	
	public Point3D(){
		this(100, 200, 300);
		System.out.println("Point3D");
	}

	public Point3D(int x, int y, int z) {
		// super(); 명시적으로 적혀있을 뿐. 없어도 자동 호출됨.(super class가)
		// super를 명시적으로 표현하지 않으면, super class의 default 생성자를 수행.
		// super()없이 PointTest의 pt4를 수행하면 x = 1, y = 1 , z = 3이 프린트됨.
		// 입력값을 1,2,3을 줬을 지라도.
		super(x, y);	
		this.z = z;
		System.out.println("Print3D(x,y,z)");
	}
	

}
