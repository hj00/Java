package conversation;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class ConversationTest {
	public static void main(String[] args) {
		String url = "https://gateway.watsonplatform.net/conversation/api";
		String username = "b4db946e-4a65-42bb-96a1-f9e94228e2fd";
		String password = "zLMsQMcRYFaZ";
		String workspace_id = "953f95d4-c621-4337-bff9-b6759c85349b"; 
		
		ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2017_02_03);
		service.setUsernameAndPassword(username, password);
		
//		Map<String, Object> context = new HashMap<String, Object>();

		MessageRequest newMessage = new MessageRequest.Builder()
			.inputText("레드").build();

		MessageResponse response = service.message(workspace_id, newMessage).execute();
		
		/*		
		InputData input = new InputData.Builder("Hi").build();
		MessageOptions options = new MessageOptions.Builder(workspaceId).input(input).build();
		MessageResponse response = service.message(options).execute();
		System.out.println(response);
		*/
	}
}
