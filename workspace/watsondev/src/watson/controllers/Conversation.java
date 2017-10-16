package watson.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.controllers.AbstractController;
import main.controllers.ModelAndeView;


public class Conversation extends AbstractController{

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndeView("/WEB-INF/views/.jsp");
	}

}
