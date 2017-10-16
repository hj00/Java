package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human(); // Instance생성
		
		h.setName("이용빈");
		h.setGender(1);
		h.setYear(1987);
		h.setJob("AI선도인력");
		h.setMarried(true);
		h.setWeight(70);
		h.setHeight(168);
		h.setHobby("서예");
		System.out.println(h);
		System.out.println("**********************************************************");
		
		AnimalLover al = new AnimalLover();
		al.setName("JB");
		al.setGender(1);
		al.setYear(1991);
		al.setJob("AI 트레이딩 알고리즘 개발자");
		al.setMarried(true);
		al.setWeight(70);
		al.setHeight(168);
		al.setHobby("테니스");
		al.setAnimalType("고양이");
		al.setaYear(2016);
		
		System.out.println(al);
	}

}
