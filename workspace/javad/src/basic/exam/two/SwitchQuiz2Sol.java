package basic.exam.two;

import java.util.Scanner;

public class SwitchQuiz2Sol {
	public static void main(String[] args) {
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int) (Math.random()*3) + 1;

		
		System.out.println("You : " + caption[you - 1]);
		System.out.println("Com : " + caption[com - 1]);
		
		//sol1
		//*
		if (you == com) System.out.println("무승부 입니다.");
		else if((you==1 && com==3)||(you==2 && com ==1)||(you==3 && com==2)) System.out.println("당신의 승리입니다.");
		else System.out.println("컴퓨터의 승리입니다.");
		//*/
		
		//sol2
		//*
		int result = you - com;
		switch ((result+3)%3) {
		case 1:
			System.out.println("컴퓨터의 승리입니다.");		    		
			break;
		
		case 2:
			System.out.println("당신의 승리입니다.");
			break;
			
		case 0:
			System.out.println("무승부 입니다.");
		default:
			break;
		}
		//*/

	}
	

}
