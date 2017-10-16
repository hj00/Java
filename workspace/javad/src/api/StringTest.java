package api;

public class StringTest {
	public static void main(String[] args) {
/*		String str = "실수란"; //아묵 것도 안쓰고 ""만 해도 이것만으로 문자열 인스턴스
		str += "신을 용서하는";
		str += "인간의 행위이다.";*/
		
		StringBuffer str = new StringBuffer();
		printString(str);
		str.append("실수란 ");printString(str);
		str.append("신을 용서하는 ");printString(str);
		str.append("인간의 행위F이다.");printString(str);

	}

	private static void printString(StringBuffer str) {
		System.out.println(str.length() + ":" + str.capacity() + ":" + str);

	}

}
