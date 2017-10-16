package api;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i2 = 10; //java5부터 가능 : Auto boxing
		
		int i3 = 1; // java 5 : Auto unboxing
		
		Object i4 = (Integer)10; // java 5이전 방식
		Object i5 = 10; // java 5부터 가능 : Auto boxing
		
		int i6 = (int) i5; 
		/*(int)를 빼면 error - 다운캐스팅이기 때문에 강제 형변환 필요
		 Object는 boxed primitives는 아니지만 자동으로 int로 강제 형변환 됨(java 7 이후부터 가능해짐)*/
		int i7 = (Integer) i5; // java 7이전의 방식(java 5-6)
		/* Object 강제 형변환의 경우 boxed primitives를 이용하는 것을 권장
		   int i7 = (Integer) i5; 과 같은 형식으로*/
		
		int i8 = Integer.parseInt("100");
		long i9 = Long.parseLong("100L");
		
		
	}

}
