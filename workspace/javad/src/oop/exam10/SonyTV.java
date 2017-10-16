package oop.exam10;

public class SonyTV implements TV {
	private Speaker speaker;

	@Override
	public void powerOn() {
		System.out.println("SonyTV : TV를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV : TV를 끕니다.");
		
	}

	@Override
	public void channelUP() {
		System.out.println("SonyTV : 채널을 올립니다.");
		
	}

	@Override
	public void channelDown() {
		System.out.println("SonyTV : 채널을 내립니다.");
		
	}

	@Override
	public void soundUP() {
		if (speaker == null) {
			System.out.println("SonyTV : 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if (speaker == null) {
			System.out.println("SonyTV : 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		
	}

}
