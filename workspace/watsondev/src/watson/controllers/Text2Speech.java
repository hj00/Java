package watson.controllers;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

import main.controllers.AbstractController;
import main.controllers.ModelAndeView;


@WebServlet("/Text2Speech")
public class Text2Speech extends AbstractController {

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		TextToSpeech service = new TextToSpeech("702dff1f-3727-4403-b3a3-caaa018e4694", "AxMXpigQsZMR");
		
		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
		return new ModelAndeView("/WEB-INF/views/text2speech/text2speech.jsp", "voices", voices);
	}
	

}
