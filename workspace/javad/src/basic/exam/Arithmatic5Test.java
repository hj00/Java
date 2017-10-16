package basic.exam;

// 축약형 연산
public class Arithmatic5Test {
	public static void main(String[] args) {
		int i = 5;
		int t = ++i; // i = i + 1 : 전위 증가
		             // t = i
		/* i = i + 1먼저 수행 그리고 t = i입력 
		   t = --i여도 마찬가지. i = i - 1 먼저 수행*/
		
		System.out.println("i = " + i);
		System.out.println("t = " + t);

	}
}
