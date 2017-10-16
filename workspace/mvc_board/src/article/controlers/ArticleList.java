package article.controlers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;

public class ArticleList extends AbstractController {
	

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		long pg = 1;
		
		try {
			pg = Long.parseLong(request.getParameter("pg"));
		} catch (Exception e) {}
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		
		ModelAndeView mav = new ModelAndeView();
		try {
			Pagination pagination = new Pagination(pg);
			
			List<ArticleVO> list = articleDAO.getArticleList(pagination);
			mav.setViewName("/WEB-INF/views/article/list.jsp");
			mav.addObject("list", list);
			mav.addObject("pagination", pagination);
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("msg", "게시물 리스트 출력에러\n관리자에게 문의하세요.");
			mav.addObject("url", "test");
		}

		return mav;
	}

}