package api;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "실수란 신을 용서하는 인간의 행위이다.";
		
		System.out.println(str.charAt(10));
		//n번째 인덱스 위치의 문자열 뽑아줌
		
		System.out.println(str.indexOf("는"));
		//해당 문자열의 인덱스 번호 위치
		
		System.out.println(str.length());
		
		System.out.println(str.lastIndexOf("는"));
		/*인덱스 번호 계산 
		- 같은 문자열이 있는 경우 오른쪽부터 읽어서 가장 먼저 나오는 문자열의 인덱스번호 반환*/
		
		System.out.println(str.replace("인간", "용빈"));
		
		System.out.println("SilSu".toLowerCase());
		System.out.println("Silsu".toUpperCase());
		
		System.out.println(str.substring(4, 6)); //처음과 끝의 인덱스 위치를 줌.
		System.out.println(str.substring(4));
		
		
		
		
		
	}

}
