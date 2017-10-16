package basic.exam.two;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, c3; // computer가 결정할 숫자
		int h1, h2, h3; // 사람이 입력할 숫자
		int s, b; // 스트라이크, 볼
		int count = 0;
		
		c1 = (int) (Math.random() * 10);
		
		do {
			c2 = (int) (Math.random() * 10);
		} while (c2 == c1);
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3 == c2 || c3 == c1);
		
		do {
			s = b = 0;
			System.out.print("0~9사이의 중복되지 않은 숫자 3개를 입력 ex 1 2 3 > ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if (h1 == c1) s++;
			else if (h1 == c2 || h1 == c3) b++;
			
			if (h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			
			if (h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.println("[" + s + "S " + b + "B]");
			
			count ++;
			
		} while(s < 3);
		System.out.println("축하합니다. " + count + "번 만에 맞추셨습니다.");
				
	}

}
