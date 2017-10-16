package basic.exam;

//형 변환
public class ConversionTest {
	public static void main(String[] args) {
		
		double d = 10; // 자동 형변환(묵시적 형변환)
		System.out.println(d);
		
		// int i = 3.14; // double type을 int type에 넣으려고 하니까 error 발생
		int i = (int) 3.14; // 강제 형변환(명시적 형변환), 이 때 int로 변환 시 무조건 버림(반올림 안함)
		int j = (int) 3.994;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int n = (int) (Math.random()*6) + 1; // n -- 1 2 3 4 5 6 중 하나의 값(랜덤)
		System.out.println("n = " + n);
		
		int n2 = (int) (Math.random()*12) + 4; // n2 -- 4 5 6 7 8 9 10 11 12 13 14 중 하나의 값(랜덤)
		System.out.println("n2 = " + n2);
		
		
		int n3 = (int) ((Math.random()*17) + 6)*100 ; // n3 -- 600 700 800 900 1000 1100 1200 1300 1400 1500 1600 1700 1800 1900 2000 2100 2200
		                                              // 위의 값 중 하나의 값(랜덤)
		System.out.println("n3 = " + n3);
		/*(int) ((Math.random()*나올 값의 갯수 만큼 곱) + 최소값)*단위 값(배수값)*/


	}

}
