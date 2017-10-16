package basic.method;

public class MethodTest2 {

	public static void main(String[] args) {
		print("yongbin"); //실매개변수
		print("heenam");
		print("hyojin");

	}
     //String name에서 선언한것과 type 및 갯수를 반드시 일치시켜야 함.
	private static void print(String name) { //형식매개변수 behavior에 전달되는 것들.
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("* hello " + name + " *");
		System.out.println("*****************");
	}

}
