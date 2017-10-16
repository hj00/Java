package basic.exam;
import java.util.Scanner;

public class ArithmaticTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	
	System.out.print("a : "); a = sc.nextInt();
	System.out.print("b : "); b = sc.nextInt();
	
	System.out.println(a + "+" + b +"=" + (a + b));
	System.out.println(a + "-" + b +"=" + (a - b));
	System.out.println(a + "*" + b +"=" + (a * b));
	System.out.println(a + "/" + b +"=" + (a / b));
// Java에서 정수/정수 = 결과도 정수(소수점 안나옴) -- 다 보기 위해선 둘 중 하나를 강제로 double type으로 형변환 시켜줘야 함.
	System.out.println(a + "/" + b +"=" + ((double)a / b));
	System.out.println(a + "%" + b +"=" + (a % b));
}
}
