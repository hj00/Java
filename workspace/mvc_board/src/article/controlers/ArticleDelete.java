package article.controlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArticleDelete extends AbstractController{
	
	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {


			long no = Long.parseLong(request.getParameter("no"));
			return new ModelAndeView("/WEB-INF/views/article/delete.jsp", "no", no);
	}
}


