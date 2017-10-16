package basic.exam.two;

public class ForTest {
	public static void main(String[] args) {
		//*
		for (int i=1; i<=3; i++) {
			System.out.println("김지혁");
			
		}
		System.out.println("종료");
        //*/

		//*
		for (int i=1; i<=10; i++) {
			System.out.println(i*10 + ":김지혁");
		}
		System.out.println("종료");
		//*/
		
		//*
		for (int i=1, j = 1; i<=10; i++) {
			System.out.println(i*10 + j + ":김지혁");
		}
		System.out.println("종료");
		//*/
	}

}
