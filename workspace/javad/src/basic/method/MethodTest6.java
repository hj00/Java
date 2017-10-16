package basic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		print(1);
		print(2,3);//method overloading : method이름은 같지만 갯수가 다른 형식으로 이름만 같이 쓰는 경우?
		print(4,5,6,7,8,9,10,111,123,456,8796,456,424121,456464,545,4546,4484,4846,5464,4424,35453);
		System.out.println("------------------------------------------------");
		/*
		String name = "최지웅";//어렵. 나중에 다시 설명. 그러니 일단 pass 
		print(name);
		System.out.println(name);
		*/
		
		int[] lotto = {1,2,3,4,5,6};
		sampRandom(lotto);
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");//참조 자료형의 경우 method에 넘겨서 method에서 값이 바뀌면 반영됨. (변경이)	        
		}
		System.out.println();	
		
		int a = 10, b = 5;
		swapNumer(a, b);
		System.out.println("a : " + a);
		System.out.println("b : " + b); // 기본 자료형의 경우 method를 호출해서 method에서 값이 바껴도 반영되지 않음.
	
	}

	private static void swapNumer(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
	}

	private static void sampRandom(int[] lotto) {
		// TODO Auto-generated method stub
		int temp = lotto[0];
		lotto[0] = lotto[5];
		lotto[5] = temp; 
	}
	
	/*
	private static void print(String name) {
		// TODO Auto-generated method stub
		name = "박병규";
	}
	*/
		
	private static void print(int... i) {//int... i -> 가변형 매개변수(인자)를 받아줌(...사용). java5부터 사용가능.
		for(int j=0; j < i.length; j++) {
			System.out.print(i[j] + "\t");
		}
		System.out.println();
	}
	
	
	/*
	private static void print(int... i) {
		for(int j:i) {//???저 가운데 대체 뭐지
			System.out.print(i[j] + "\t");
		}
		System.out.println();
	}
	*/

	/*
	private static void print(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i + "\t" + j + "\t" + k);
	}

	private static void print(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + "\t" + j);
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	*/

}
