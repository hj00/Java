package basic.exam.two;

public class SwitchTest {
	public static void main(String[] args) {
		int n = 1; //주민번호 일곱번째 자리 - 1 : 남자, 2 : 여자
		
		switch (n) {
		case 1:
		case 3:
			System.out.println("남자");
			break; // break를 만나기전까지 계속 수행하게 되므로 여러 조건 같은 결과에 대해 그냥 case 겹쳐쓰면 됨.
			
		case 2:
		case 4:
		    System.out.println("여자");
		    break;  

		default:
			System.out.println("에러");
			break;
		}
	}

}
