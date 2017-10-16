package oop.exam10;
//interface에 있는 메소드를 반드시 이 클래스(구현클래스)에서 다 구현해줘야 함.
public class SamsungTV implements TV {
	private Speaker speaker; // HarmanSpeaker를 Upcasting해서 참조.
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	} // new 사용 줄이기 위한 방법1
	
	public void powerOn() {
		System.out.println("SamsungTV : TV를 켭니다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV : TV를 끕니다.");
	}
	public void channelUP(){
		System.out.println("SamsungTV : 채널을 올립니다.");
	}
	public void channelDown(){
		System.out.println("SamsungTV : 채널을 내립니다.");
	}
	public void soundUP() {
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
	}
	
	public void soundDown() {
		if (speaker == null) {
			System.out.println("SamsungTV : 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
		
	}

}
