package oop.exam9;

public class Singleton {
	
	// 자기자신을 참조하는 변수 생성. 공유 위해 static
	private static Singleton s = null;
	
	// 외부에서 instance 생성을 마음대로 못하게 하도록 생성자 파일을 새로 만듦.(private으로)
	private Singleton() {} 
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

	
	@Override // @ : Annotation?
	public String toString() {
		// TODO Auto-generated method stub
		return "포기하는 그 순간 시합종료다.";
	
//		public String toSting(){
//		return "포기하는 그 순간 시합종료다"
//	}
	//package - class 이름 @ hash code 내부 object에 저장되어 있는 String을 출력

	}

}
