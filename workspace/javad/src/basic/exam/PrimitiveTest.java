package basic.exam;

public class PrimitiveTest {
	public static void main(String[] args) {
		// boolean : true or false를 나타내는 1비트(메모리에서는 1바이트 할당)
		/*
		boolean b = true;
		System.out.println("b = " + b);
		//*/
		
		// byte : -128 ~ +128 까지의 표현범위를 가짐. 1byte(1byte 할당)
		/*
		byte b2 = 127;
		System.out.println("b2 = " + b2);
		//*/
		
		// int : -2147483648 ~ +2147483647 표현범위. 기본 4byte
		/*
		int i = 2147483647;
		System.out.println("i = " + i);
		//*/
		
		// short : -32768 ~ +32767 기본 2byte
		/*
		short s = 32767;
		System.out.println("s = " + s);
		//*/
		
		/* long : +- 900경 8byte type, 기본 int형으로 인식 -> int 범위 넘어가면 error
		 숫자 끝에 영문 L을 소문자든 대문자든 상관없이 붙여주면 됨.
		 숫자 1과 헷갈릴 수 있으므로 가능하면 대문자 L 추천 */
		/*
		long l1 = 2147483648L;
		System.out.println("l1 = " + l1);
		//*/
		
		// char(character type) : 2byte
		/*
		char c = '쀍';
		System.out.println("c = " + c);
		//*/
		
		// double : 8 byte
		/*
		double d = 3.1415926535;
		System.out.println("d = " + d);
		//*/
		
		/* float : 4 byte 기본적으로 숫자 : double type으로 인식 
		   -> double type이 아닌 float type임을 인지시켜줘야 함.(끝에 f붙임)*/
		/*
		float f = 3.1415926535f;
		System.out.println("f = " + f);
		//*/
		
		
		// \t : tab 만큼 띄우는 것
		System.out.println("가\t나\t다");
		// tab으로 띄어쓰기 해도 마찬가지
		System.out.println("가 	나	다");
		System.out.println("안녕하세요\t딸기밭이여 영원하라");
        // 역슬래쉬를 프린트하고 싶은 경우 더블 역슬래쉬
		System.out.println("하이\\하이");
		// ""double quotation mark 표시하고 싶은 경우 escape sequence 역슬래쉬 사용하여 표현 가능
		System.out.println("\"야호~~~~\"");
		System.out.print("a");
        System.out.print("b");
	    }
}
