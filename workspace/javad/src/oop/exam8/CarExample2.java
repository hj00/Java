package oop.exam8;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 car21 = new Car2();
		System.out.println("car21.company : " +car21.company);
		System.out.println();
		
		Car2 car22 = new Car2("자가용");
		System.out.println("car22.company : " + car22.company);
		System.out.println("car22.model : " + car22.model);
		System.out.println("car22.color : " + car22.color);
		System.out.println("car22.maxSpeed : " + car22.maxSpeed);
		System.out.println();
		
		Car2 car23 = new Car2("자가용", "빨강");
		System.out.println("car23.company : " + car23.company);
		System.out.println("car23.model : " + car23.model);
		System.out.println("car23.color : " + car23.color);
		System.out.println("car23.maxSpeed : " + car23.maxSpeed);
		System.out.println();
		
		Car2 car24 = new Car2("택시", "검정", 200);
		System.out.println("car24.company : " + car24.company);
		System.out.println("car24.model : " + car24.model);
		System.out.println("car24.color : " + car24.color);
		System.out.println("car24.maxSpeed : " + car24.maxSpeed);
	}

}
