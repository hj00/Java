package oop.exam8;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car2() {
		   
	}      
           
	public Car2(String model) {//생성자 내부에서 생성자 호출
		this(model, "은색", 250);
	}

	public Car2(String model, String color) {//생성자 내부에서 생성자 호출
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) { //공통 식행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	public Car2() {
//		   
//	}      
//           
//	public Car2(String model) {
//		super();
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
//	}
//
//	public Car2(String model, String color) {
//		super();
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
//	}
//
//	public Car2(String model, String color, int maxSpeed) {
//		super();
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	// 생성자들 내부에서 코드들이 중복됨.

}
