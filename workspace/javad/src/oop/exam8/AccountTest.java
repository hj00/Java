package oop.exam8;

public class AccountTest {
	public static void main(String[] args) {
		
		Account a1 = new Account(1000);
		System.out.println("a1.money1 : " + a1.money1);
		System.out.println("a1.money2 : " + a1.money2);
		System.out.println(Account.money1);
		
		Account a2 = new Account(1000); 		
		System.out.println("a2.money2 : " + a2.money1);
		System.out.println("a2.money2 : " + a2.money2);// a1과는 별개의 인스턴스 이므로 a1에 영향받지 않음
		                                               //money1을 static으로 바꾸면 달라짐
		System.out.println(Account.money1);
		
		Account a3 = new Account(1000);
		System.out.println("a3.money2 : " + a3.money1);
		System.out.println("a3.money2 : " + a3.money2);
		System.out.println(Account.money1);
	}

}
