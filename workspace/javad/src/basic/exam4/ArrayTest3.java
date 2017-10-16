package basic.exam4;

public class ArrayTest3 {
	public static void main(String[] args){
		//int[열]
		//int[행][열]
		//int[표][행][열]
		//int[표에대한 더미][표][행][열]
		int[][] score = 
			{
					{100, 90, 80, 70},
					{ 90, 80, 70, 60},
					{ 80, 70, 60, 50}
			};//행과 열을 가진 배열을 줄 때는 대괄호를 두개 해주면 됨.int[][]
		      //배열에 대괄호 하나의 경우 -> 열로 들어간다. 라고 생각하면 됨.int[]
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		int rowlen = score.length; // 성능 위해서 선언.for문안에서 계속 score.length를 찾아 가는 것 보다 나음.
		int collen = score[0].length;//score[0].length : score의 0번 행의 갯수
        //*
		for (int row=0; row < rowlen; row++) {
			 int sum = 0;
			 for(int col=0; col < collen; col++) {
				 sum += score[row][col];
				 System.out.print(score[row][col] + "\t");
			} 
		    System.out.print(sum + "\t");
			System.out.println(sum/score[row].length); // sum/4랑 같음. 이 경우는 
		}//*/
		
		//*
		for (int row=0; row < rowlen; row++) {
			 int sum = 0;
			 int avg = 0;
			 for(int col=0; col < collen; col++) {
				 sum += score[row][col];
				 System.out.print(score[row][col] + "\t");
                 avg = sum/score[row].length;
			} 
		    System.out.print(sum + "\t");
			System.out.println(avg);
		}
		//*/
		
	}

}
