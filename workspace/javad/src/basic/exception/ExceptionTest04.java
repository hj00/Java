package basic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하세요. > ");
		int n = -1;
				
		try {
			n = sc.nextInt();
			//정수만 받기로 한 관계를 null 값을 입력하면 바로 catch로 넘어감.
			//String값을 너어도 마찬가지로 해당하는 형식이 아니게 되므로 catch로 넘어가서 error처리 함.
			if (!(1 <= n && n <= 99)) {
				throw new InputMismatchException("잘못된 입력입니다.");
			}
			System.out.println("입력된 값은 " + n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에러 : " + e.getMessage());
		}
	}

}
