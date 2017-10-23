package net.watson.chat.dev;

import java.util.Scanner;

import org.junit.Test;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class ConversationTest {

	@Test
	public void testConversation() {
		Conversation service = new Conversation(Conversation.VERSION_DATE_2017_05_26);
		service.setUsernameAndPassword("fd631f1b-57d1-4334-a650-a69edf94e45d", "4EKVNuvZ17V6");
		Scanner sc = new Scanner(System.in);
		
		MessageResponse response = null;
		Context context = null;
		MessageOptions options = null;
		String msg = "";
		StringBuffer watsonSay = null;
		while (true) {
			options = new MessageOptions.Builder().workspaceId("bb1fb091-625f-4f01-ac83-b70a2c6f5e8d")
					.input(new InputData.Builder(msg).build()).context(context).build();

			response = service.message(options).execute();
			System.out.print("watson : ");
			
			watsonSay = new StringBuffer();
			
			// getOutput.getText대신에 response 개체를 가져와서 json parsing해도 됨.
			for (String text : response.getOutput().getText()) {
				watsonSay.append(text);
				watsonSay.append(" ");
			}
			
			System.out.println(watsonSay);
			System.out.print("I : ");
			msg = sc.nextLine();
			context = response.getContext();
			
		}
		/*
		 * InputData input = new InputData.Builder("프린터가 이상해요").build(); MessageOptions
		 * options = new
		 * MessageOptions.Builder("bb1fb091-625f-4f01-ac83-b70a2c6f5e8d").input(input).
		 * build();
		 * 
		 * MessageResponse response = service.message(options).execute();
		 * System.out.println(response);
		 */
	}

}
