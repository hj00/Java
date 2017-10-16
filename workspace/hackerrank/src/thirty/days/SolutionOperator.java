package thirty.days;

import java.util.Scanner;

public class SolutionOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		scan.close();
		
				
		double tip = (((double) tipPercent)/100)*mealCost;
		double tax = (((double) taxPercent)/100)*mealCost;
		double tCost = mealCost + tip + tax;
		
		int totalCost = (int) Math.round(tCost);
		
		System.out.println("The total meal cost is " + totalCost + " dollars.");

	}

}
