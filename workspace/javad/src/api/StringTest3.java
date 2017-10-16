package api;

public class StringTest3 {
	public static void main(String[] args) {
		String str1 = "제이비는 몇살때부터 자바를 잘했나?";
		String str2 = "제이비는 몇살때부터 자바를 잘했나?";
		
//		System.out.println(str1.replace("몇살때", "언제"));
//		System.out.println(str1);
		//원본데이터 자체를 바꾸고 싶다면 인스턴스를 새로 할당해야 함.
		
		if (str1 == str2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		} // replace로 바꿔서 출력하였으나 인스턴스는 그대로 이므로 같다 라는 결과를 보게 됨.
		
		System.out.println(str1 = str1.replace("몇살때", "언제"));
		System.out.println(str1);
		//String class는 원본데이터에 변경이 가해지는 경우 반드시 복제를 한 번 한 후 사용.
		
		
	}

}
