package basic.exam.two;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 100 Score를 정수로 입력 > ");
		
		int score = sc.nextInt();
		if (score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else System.out.println("F");
		
		System.out.print("0 ~ 100 Score2를 정수로 입력 > ");		
		int score2 = sc.nextInt();
		if (90 <= score2 && score2 <= 100) System.out.println("A");
		else if (score2 >= 80) System.out.println("B");
		else if (score2 >= 70) System.out.println("C");
		else if (score2 >= 60) System.out.println("D");
		else System.out.println("F");
		
		System.out.print("0 ~ 100 Score3를 정수로 입력 > ");		
		int score3 = sc.nextInt();
		if      (90 <= score3 && score3 <= 100) System.out.println("A");
		else if (80 <= score3 && score3 <= 89) System.out.println("B");
		else if (70 <= score3 && score3 <= 79) System.out.println("C");
		else if (60 <= score3 && score3 <= 69) System.out.println("D");
		else System.out.println("F");		
	}

}
