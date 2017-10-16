package basic.exam.two;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		/*
		int n = 2; // 주민등록번호 7번째 숫자 가정
		
		if (n == 2) {
			System.out.println("n = 여자"); // n == 2일 때는 여자 종료 출력 그 외, 종료만 출력
		} // if 안에 참인 경우 출력하는 경우가 하나 일 경우는 {}를 생략 할 수 있지만 생략하지 않을 것을 권고
		
		System.out.println("종료");
		
		int n2 = 1;
		
		if (n2 == 2) {
			System.out.println("n2 = 여자");
		} else {
			System.out.println("n2 = 남자");
		}
		System.out.println("종료");
		
		
		int n3 = 1;
		
		if (n3 == 2) {
			System.out.println("n3 = 여자");
		} else if (n3 == 1) {
			System.out.println("n3 = 남자");
		} else {
			System.out.println("n3 = 에러");
		}
		System.out.println("종료");
		*/
		
		// Q3. Scanner 사용 / 정수를 입력 : 0~100(정수) 90~100 : A, 80~89 : B, 70~79 :C, 60~69 : D, 0~59 : F
		
		Scanner sa = new Scanner(System.in);
		System.out.print("점수 : "); int n4 = sa.nextInt();
		
        /*
		if (n4 >= 90 && n4 <= 100) {
			System.out.println("A");
		} else if (80 <= n4 && n4 <= 89) {
			System.out.println("B");
		} else if (70 <= n4 && n4 <= 79) {
			System.out.println("C");
		} else if (60 <= n4 && n4 <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		*/
		
		if (n4 >= 90 && n4 <= 100) {
			System.out.println("A");
		} else if (80 <= n4) {
			System.out.println("B");
		} else if (70 <= n4) {
			System.out.println("C");
		} else if (60 <= n4) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
