package basic.exam;
import java.util.Scanner;

public class Arithmatic2Test {
	public static void main(String[] args) {
		//관계형 연산 (>,<,=,>=,<=,!=)
		
		Scanner sa = new Scanner(System.in);
		
		System.out.print("정수 : 입력 "); int i = sa.nextInt();
		System.out.print("정수 : 입력 "); int j = sa.nextInt();
		
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
	}
}
