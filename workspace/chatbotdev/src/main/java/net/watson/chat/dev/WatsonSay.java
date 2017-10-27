package net.watson.chat.dev;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@RestController
public class WatsonSay {
	private static Logger logger = LoggerFactory.getLogger(WatsonSay.class);

	@RequestMapping(value = "watsonsay")
	public MessageResponse watsonsay(String isay, HttpSession session) {
		logger.info("user input : " + isay);
		
		Conversation service = new Conversation(Conversation.VERSION_DATE_2017_05_26);
		service.setUsernameAndPassword("fd631f1b-57d1-4334-a650-a69edf94e45d", "4EKVNuvZ17V6");

		MessageResponse response = null;
		Context context = (Context) session.getAttribute("context");
		MessageOptions options = null;
		String msg = isay;
		StringBuffer watsonSay = null;

		options = new MessageOptions.Builder()
				.workspaceId("bb1fb091-625f-4f01-ac83-b70a2c6f5e8d")
				.input(new InputData.Builder(msg).build())
				.context(context)
				.build();
		response = service.message(options).execute();

		watsonSay = new StringBuffer();
		for (String text : response.getOutput().getText()) {
			watsonSay.append(text);
			watsonSay.append(" ");
		}

		logger.info("Watson : " + watsonSay);
		context = response.getContext();
		session.setAttribute("context", context);
		return response;
	}
}
