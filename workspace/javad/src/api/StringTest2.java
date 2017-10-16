package api;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "안녕하세요"; 
		String str2 = "안녕하세요";
		/*heap에 안녕하세요 인스턴스 생성.
		  기존의 heap str1의 것을 복사해서 가르킴(같은 안녕하세요 인스턴스를) 
		  -- hashcode가 같아짐. */
		
		if (str1 == str2) { 
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		String str3 = new String("안녕하세요.2");
		String str4 = new String("안녕하세요.2");
		/* str3 새로운 인스턴스를 하나 만들게 됨. + 
		   str4 또한 새로운 인스턴스를 만들어서 가르킴? 다르다가 됨.
		   그래서 내용이 같은지 다른지를 보기 위해서는 if(str3.equals(str4)를 이용*/
		if (str3 == str4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		if (str3.equals(str4)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}

}
