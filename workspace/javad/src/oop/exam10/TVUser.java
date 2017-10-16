package oop.exam10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.load(new FileInputStream("product.properties"));
		Class clazz1 = Class.forName(p.getProperty("tv"));
		Class clazz2 = Class.forName(p.getProperty("speaker"));
		
		TV tv = (TV) clazz1.newInstance(); //new SonyTV();
		Speaker speaker = (Speaker) clazz2.newInstance();
//		TV tv = new SamsungTV(); //Upcasting 
		// SamsungTV만 LgTV로 변경하는 것만으로 SamsungTV에서 LgTV를 사용할 수 있음.
//      TV tv = new LgTV(); LgTV에서 AppleSpeaker를 사용하고 싶은 경우.
//		tv.setSpeaker(new AppleSpeaker()); 
		
		//TV tv = new SonyTV();
		tv.setSpeaker(new OrangeSpeaker());
		tv.powerOn();
		tv.channelUP();
		tv.channelUP();
		tv.soundUP();
		tv.soundUP();
		tv.soundDown();
		tv.powerOff();
		
		
		/*
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUP();
		tv.channelUP();
		tv.soundUP();
		tv.soundUP();
		tv.soundDown();
		tv.powerOff();
		//*/

		/*
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.channelUP();
		tv.channelUP();
		tv.volumeUP();
		tv.volumeUP();
		tv.volumeDown();
		tv.turnOff(); 
		//*/
		//samsungTV와 유사하한 기능을 하지만 메소드 명들이 조금씩 다른 경우 
		// -> 불편. 코드가 길어지면 더 힘듦. => 인터페이스 사용(일종의 표준을 만들어주는 것)
	}

}
