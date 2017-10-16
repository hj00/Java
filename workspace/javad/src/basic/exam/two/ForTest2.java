package basic.exam.two;

public class ForTest2 {
	public static void main(String[] args) {
		// 1부터 3까지 정수의 합
		int sum = 0; // sum에 대한 초기화 반드시 필요. sum 값이 얼마인지 모르는 상태에서 +i를 계산할 수는 없음.

		//*
		for (int i = 1; i<=3; i++) { sum += i; } System.out.println(sum); //
		//*/

		// Q.1부터 1000까지 3의 배수의 합계를 구하세요.
		//sol1
		//*
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		//*/
		
		//sol2(그냥 다른 경우도 있다는 의미) -- 성능은 더 좋을 수도 있음. 하지만 이정도로 성능얘기하긴 애매
		//도는 수가 더 많은 경우엔 더 나을 수도 있음.
		//*/
		for (int i = 3; i <= 1000; i = i+3) {
				sum += i;
		}
		System.out.println(sum);
		//*/
		
	}

}
