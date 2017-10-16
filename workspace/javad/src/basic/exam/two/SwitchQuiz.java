package basic.exam.two;

import java.util.Scanner;

public class SwitchQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("점수를 입력하시오 : ");int score = sc.nextInt();
		
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		

		default:
			System.out.println("F");
			break;
		}
		
	}

}
