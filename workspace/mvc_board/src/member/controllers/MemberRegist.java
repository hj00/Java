package member.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.controlers.AbstractController;
import article.controlers.ModelAndeView;

public class MemberRegist extends AbstractController{

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndeView("/WEB-INF/views/member/regist.jsp");
	}

}
