package conversation;

import java.util.List;
import java.util.Scanner;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class ConversationTest {
	public static void main(String[] args) {
		String url = "https://gateway.watsonplatform.net/conversation/api";
		String username = "b4db946e-4a65-42bb-96a1-f9e94228e2fd";
		String password = "zLMsQMcRYFaZ";
		String workspace_id = "953f95d4-c621-4337-bff9-b6759c85349b"; 
		
		Scanner sc = new Scanner(System.in);
		ConversationService service = new ConversationService(ConversationService.VERSION_DATE_2017_02_03);
		service.setUsernameAndPassword(username, password);
		
//		Map<String, Object> context = new HashMap<String, Object>();
		
		MessageRequest request = null;
		MessageResponse response = null;
		String msg = null;
		
		for (;;) {
			request = new MessageRequest.Builder().inputText("msg").build();
			response = service.message(workspace_id, request).execute();
		
		/*		
		MessageRequest newMessage = new MessageRequest.Builder()
			.inputText("레드").build();

		MessageResponse response = service.message(workspace_id, newMessage).execute();
		*/
		
			List<String> watsonsays = response.getText();
			for (String say : watsonsays) {
				System.out.println("Watson: " + say);
			}
			System.out.print("I : "); msg = sc.nextLine();
		}
		
		
		/*		
		InputData input = new InputData.Builder("Hi").build();
		MessageOptions options = new MessageOptions.Builder(workspaceId).input(input).build();
		MessageResponse response = service.message(options).execute();
		System.out.println(response);
		*/
	}
}
