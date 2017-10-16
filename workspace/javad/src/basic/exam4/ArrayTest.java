package basic.exam4;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] n = new int[3];//int score1[]라고 써도 상관은 없지만 가능하면 배열은 type 다음에 쓰도록 하자.
		// 배열은 type다음에 []대괄호로 받음.
		n[0] = 100;
		n[1] = 90;
		n[2] = 70;
	
		
		int[] n2 = new int[]{100, 90, 70};
		for(int i=0; i < n.length; i++) { //i<n.length = i<3
			System.out.println(n[i]);
		}

	}

}
