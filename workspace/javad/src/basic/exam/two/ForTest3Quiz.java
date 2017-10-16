package basic.exam.two;

public class ForTest3Quiz {
	public static void main(String[] args) {
		//*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*/
		
		//*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*/
		
		//*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) System.out.print("*");
			}
			System.out.println();
		}
		//*/
		
	}

}
