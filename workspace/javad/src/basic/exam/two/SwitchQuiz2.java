package basic.exam.two;

import java.util.Scanner;

public class SwitchQuiz2 {
	public static void main(String[] args) {
		//my solution
		Scanner sa = new Scanner(System.in);
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력하세요.");
		System.out.print("You : ");int a = sa.nextInt();
		int b = (int) (Math.random()*3) + 1;
		System.out.println("Computer : " + b);
		
		
		if (a == b) System.out.println("무승부 입니다.");
		else if((a==1 && b==3)||(a==2 && b ==1)||(a==3 && b==2)) System.out.println("당신의 승리입니다.");
		else System.out.println("컴퓨터의 승리입니다.");


		
	}

}
