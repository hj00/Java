package watson.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import main.controllers.AbstractController;
import main.controllers.ModelAndeView;


public class ConversationController extends AbstractController{

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String url = "https://gateway.watsonplatform.net/conversation/api";
		String username = "b4db946e-4a65-42bb-96a1-f9e94228e2fd";
		String password = "zLMsQMcRYFaZ";
		String workspace_id = "953f95d4-c621-4337-bff9-b6759c85349b"; 
		
		ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2017_02_03);
		service.setUsernameAndPassword(username, password);
		
		MessageRequest mrequest = null;
		MessageResponse mresponse = null;
		String isay = request.getParameter("isay").trim();
		
		mrequest = new MessageRequest.Builder().inputText(isay).build();
		mresponse = service.message(workspace_id, mrequest).execute();

		List<String> watsonsays = mresponse.getText();
		
		return new ModelAndeView("/WEB-INF/views/watsonsay.jsp", "watsonsays", watsonsays);
	}

}
