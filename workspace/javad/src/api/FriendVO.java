package api;

public class FriendVO {
	private String phone;
	//전화번호 : 수식 계산이나 그런걸 할 일 없고, 문자열로써 매칭 검색을 더 많이 하게 됨.
	//String으로 넣는 게 좋음
	private int age;
	private int gender;
	
	
	public FriendVO(String phone, int age, int gender) {
		super();
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhon(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "FriendVO [phone=" + phone + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
