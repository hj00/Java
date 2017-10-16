package thirty.days;

import java.util.Scanner;

public class SolutionType {
	public static void main(String[] args) {
		int i = 4;
		double d= 4.0;
		String s = "HackerRank";
		
		Scanner scan = new Scanner(System.in);
		
		int i2 = scan.nextInt();
		double d2 = scan.nextDouble();
		
//		String s2 = scan.next();
		String s2 = scan.nextLine();
		s2 = scan.nextLine();

		System.out.println(i+i2);
		System.out.println(d + d2);
		System.out.println(s + s2);
		
	}

}
