package oop.exam10;

//TV가 super type이 되고 SamsungTV, LgTV등이 sub type이 됨.
public interface TV {
	//바디 없는 상태의 추상메소드.
    //JAVA7까지는 interface에 들어오는 모든 메소드는 기본 추상메소드.
    //abstract를 생략해도됨.
	public abstract void powerOn();
	public void powerOff();
	public void channelUP();
	public void channelDown();
	public void soundUP();
	public void soundDown();
	public void setSpeaker(Speaker speaker);

}
