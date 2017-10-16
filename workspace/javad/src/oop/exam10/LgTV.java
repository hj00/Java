package oop.exam10;

public class LgTV implements TV {
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV : TV를 켭니다.");
	}
	public void powerOff() {
		System.out.println("LgTV : TV를 끕니다.");
	}
	public void channelUP(){
		System.out.println("LgTV : 채널을 올립니다.");
	}
	public void channelDown(){
		System.out.println("LgTV : 채널을 내립니다.");
	}
	public void soundUP() {
		if (speaker == null) {
			System.out.println("LgTV : 소리를 키웁니다.");
		} else speaker.soundUp();
		
	}
	public void soundDown() {
		if (speaker == null) {
			System.out.println("LgTV : 소리를 줄입니다.");
		} else speaker.soundDown();
		
	}
	@Override
	public void setSpeaker(Speaker speaker) {	
		this.speaker = speaker;
	}
	
	/*
	 	public void turnOn() {
		System.out.println("LgTV : TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("LgTV : TV를 끕니다.");
	}
	public void channelUP(){
		System.out.println("LgTV : 채널을 올립니다.");
	}
	public void channelDown(){
		System.out.println("LgTV : 채널을 내립니다.");
	}
	public void volumeUP() {
		System.out.println("LgTV : 소리를 키웁니다.");
	}
	public void volumeDown() {
		System.out.println("LgTV : 소리를 줄입니다.");
	}
	*/

}
