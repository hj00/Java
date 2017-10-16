package basic.exam.two;

public class ForTest3Quiz2 {
	public static void main(String[] args) {
		//*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; i + j <= 6; j++) {
				 System.out.print("*");
			     }
			System.out.println();
            }
		//*/
		
		//*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				 System.out.print("*");
			     }
			System.out.println();
            }
		//*/
		
		
	}
}

