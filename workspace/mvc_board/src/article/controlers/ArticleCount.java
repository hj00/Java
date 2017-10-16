package article.controlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArticleCount extends AbstractController{

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		long pg = 1;
		pg = Long.parseLong(request.getParameter("pg"));
		
		return new ModelAndeView("/WEB-INF/views/article/list.jsp", "pg", pg);
		
		
		
		
	}

}
