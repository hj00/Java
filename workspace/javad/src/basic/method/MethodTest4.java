package basic.method;

import java.util.Scanner;

public class MethodTest4 {

		public static void main(String[] args) {
						
			Scanner sc = new Scanner(System.in);
			System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
			int you = sc.nextInt();
			int com = (int) (Math.random()*3) + 1;

			
			System.out.println("You : " + caption(you));			
			System.out.println("Com : " + caption(com));
			
			
			int result = you - com;
			switch ((result+3)%3) {
			case 1:
				System.out.println("당신의 승리입니다.");		    		
				break;
			
			case 2:
				System.out.println("컴퓨터의 승리입니다.");
				break;
				
			case 0:
				System.out.println("무승부 입니다.");
			default:
				break;
			}
			
	}

	private static String caption(int value) {
		// TODO Auto-generated method stub
		switch(value){
		case 1:return "가위";
		case 2:return "바위";
		case 3:return "보";
		default: return null;
		}

	}

}
