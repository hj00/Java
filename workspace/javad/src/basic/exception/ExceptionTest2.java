package basic.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
	private static void throwException() throws Exception {
		String str = null;
		System.out.println(str.toString());
		System.out.println("throwException 종료");
	}

}
