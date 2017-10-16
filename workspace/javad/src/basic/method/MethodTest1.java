package basic.method;

public class MethodTest1 {
	//int i -> Property
	public static void main(String[] args) {
		print();
		print();
		print();
		/*
		System.out.println("*********");
		System.out.println("* hello *");
		System.out.println("*********");
		
		System.out.println("*********");
		System.out.println("* hello *");
		System.out.println("*********");
		
		System.out.println("*********");
		System.out.println("* hello *");
		System.out.println("*********");
		*/
	}
	// 중복되는 명령문을 모듈화 -> method
	private static void print() { //Behavior
		// TODO Auto-generated method stub
		System.out.println("*********");
		System.out.println("* hello *");
		System.out.println("*********");
	}

}
