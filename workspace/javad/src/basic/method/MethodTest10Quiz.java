package basic.method;

public class MethodTest10Quiz {
	public static void main(String[] args) {
		int[] n = {23, 10, 70, 80, 60, 25};

		int max = maxNumber(n);
		int min = minNumber(n);
		
		System.out.println("배열 n에서 가장 큰 값은 : " + max);
		System.out.println("배열 n에서 가장 작은 값은 : " + min);
	}

	private static int minNumber(int[] n) {
		// TODO Auto-generated method stub
		int min = n[0];
		
		for (int i = 1; i<n.length; i++) {
			if (n[0]<min)
				min = n[i];
		}
		return min;
	}

	private static int maxNumber(int[] n) {
		// TODO Auto-generated method stub
		int max = n[0];

		for (int i = 1; i < n.length; i++) {
			if (n[i] > max)
				max = n[i];
		}
		return max;

	}

}
