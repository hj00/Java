package basic.exam;

// 축약형 연산
public class Arithmatic6Test2 {
	public static void main(String[] args) {
		int i = 5;
		int t = i++;  // t = i : 후위 증가
		              // i = i + 1
		/* t = i 먼저 입력, 후에 i = i + 1 연산*/
		
		System.out.println("i = " + i);
		System.out.println("t = " + t);

	}
}
