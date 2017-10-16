package basic.exam.two;

public class ContinueTest {
	public static void main(String[] args) {
		// Q.1부터 1000까지 3의 배수의 합계를 구하세요.
		int sum = 0; // sum에 대한 초기화 반드시 필요. sum 값이 얼마인지 모르는 상태에서 +i를 계산할 수는 없음.

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 != 0) continue;
				sum += i;
		}
		System.out.println(sum);		
		
	}

}
