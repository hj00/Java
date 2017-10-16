package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		
		//sub typd 인스턴스는 super type으로 참조 가능
		Animal animal2 = new Bird(); //자동형변환(묵시적형변환) = Up Casting (몇 단계든 상관 없음)
		System.out.println(animal2);
		
		Animal animal3 = new Eagle();
		System.out.println(animal3);
		
		//Bird bird = (Bird) animal; //컴파일 시에는 모르고 실행 시 error - RuntimeException
		//System.out.println(bird);
		
		//Condor condor = new Condor();
		//System.out.println(condor);
		
		
		//Down Casting 
		//Down Casting은 원래 인스턴스의 타입이 캐스팅 하려는 타입이거나 캐스팅 타입의 서브타입이어야 함.
		//Down Casting은 재참조여야 함.?
		Animal condor = new Condor(); //condor을 Animal type으로 참조 -> Condor로 가져다 씀.
		Condor condor2 = (Condor) condor;
		System.out.println(condor2);
		
		Animal eagle = new Eagle();//
		Bird bird2 = (Bird) eagle;
		System.out.println(bird2);
		
		Eagle eagle2 = (Eagle) bird2;
		System.out.println(eagle2);
		
		/*
		Condor condor2 = (Condor) eagle;//강제 형변환 하려는 경우 error
		System.out.println(condor2);
		*/
		
		//본인 인스턴스와 상속 관계가 있어야만 up-down casting 가능.
		//업캐스팅 다운 캐스팅은 상속관계에서만 가능.
	    //Tiger tiger = (Tiger) eagle;

	}
}
