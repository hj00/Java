package basic.method;

public class MethodTest8 {
	public static void main(String[] args) {
		int a = 10;
		testFunction(a);//call by value
		System.out.println("main : " + a);
	}

	private static void testFunction(int a) {
		// TODO Auto-generated method stub
		a++;
		System.out.println("testFunctin : " + a);
	}

}
