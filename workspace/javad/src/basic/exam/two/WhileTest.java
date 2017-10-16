package basic.exam.two;

public class WhileTest {
	public static void main(String[] args) {
		//*
		int i = 1;
		while(i <= 10) {
			System.out.println(i*10 + ":김지혁");
			i++;
		}
		System.out.println("종료");
		//*/
		
		//*
		int sum = 0;
		int i2 = 0;
		while (i2 <= 1000) {
			sum += i2;
			i2 += 3;
		}
		System.out.println(sum);
		//*/
		
		//*
		int sum2 = 0;
		int i3 = 1;
		while (i3 <= 1000) {
			if(i3%3==0){
				sum2 += i3;
			}
			i3++;
		}
		System.out.println(sum2);
		//*/
	}

}
