package basic.method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n = {100, 200};
		
		swamFunction(n);//call by reference
		System.out.println(n[0]);
		System.out.println(n[1]);
	}

	private static void swamFunction(int[] yongbin) {
		//배열, 클래스 타입, 인스턴스 타입등으로 참조타입으로 넘긴 경우에는 값 변형이 main에도 영향을 줌.
		// TODO Auto-generated method stub
		int temp = yongbin[0];
		yongbin[0] = yongbin[1];
		yongbin[1] = temp;
				
	}

}
