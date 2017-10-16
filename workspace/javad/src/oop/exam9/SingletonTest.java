package oop.exam9;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1 + " : " + s1.hashCode());

		Singleton s2 = Singleton.getInstance();
		System.out.println(s2 + " : " + s2.hashCode());
		// hashcode가 다름 -> 서로 다른 인스턴스 임을 의미
		// singleton으로 만들고 난 후 : hashcode가 같아짐 - 같은 인스턴스를 공유하게 됨.
		
	}

}
