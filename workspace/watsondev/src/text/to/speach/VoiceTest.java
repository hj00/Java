package text.to.speach;

import java.util.List;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public class VoiceTest {
	public static void main(String[] args) {
		TextToSpeech service = new TextToSpeech("3930554f-f5fa-47f2-8d7b-f62ffe090e66", "7QlMMCNdzogs");
//		service.setUsernameAndPassword("702dff1f-3727-4403-b3a3-caaa018e4694", "AxMXpigQsZMR");
		
		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
		
		for(Voice voice : voices) {
			System.out.println(voice.getName() + ": " + voice.getLanguage());
		}
		
		
	}

}
