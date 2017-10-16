package basic.exam4;

public class ArrayTest2 {
	public static void main(String[] args) {
		boolean[] b = new boolean[1];
		System.out.println(b[0]); // boolean 기본 값이 false임을 알 수 있음.
		
		char[] c = new char[1];
		System.out.println(c[0]); // char의 경우 공백이 출력됨.
		
		int[] i = new int[1];
		System.out.println(i[0]); // int는 기본 값이 0 출력
		
		short[] s = new short[1];
		System.out.println(s[0]); //short도 int와 마찬가지로 0
		
		long[] l = new long[1];
		System.out.println(l[0]);//long도 int와 마찬가지로 0
		
		byte[] b2 = new byte[1];
		System.out.println(b2[0]);//byte도 int와 마찬가지로 0
		
		double[] d = new double[1];
        System.out.println(d[0]);//double의 경우 0.0이 기본값
        
        float[] f =  new float[1];
        System.out.println(f[0]);//float의 경우 0.0이 기본값
		
	}

}
