package basic.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		try {
			System.out.println(str.toString());
			System.out.println(10/0);
			//throw new NullPointerException();
		} catch(NullPointerException e) {
			//System.out.println("개체 할당이 안됐음..ㅜㅜ");
			System.out.println("인스턴스 할당이 안됐음..ㅜㅜ");
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			System.out.println("무조건 수행");
		}
		
		System.out.println("종료");
		
		
	}

}
