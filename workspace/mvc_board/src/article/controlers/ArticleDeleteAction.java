package article.controlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;

public class ArticleDeleteAction extends AbstractController {

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		Long no = Long.parseLong(request.getParameter("no"));
		String pwd = request.getParameter("pwd");
		
		ArticleVO articleVO = new ArticleVO();
		articleVO.setNo(no);
		articleVO.setPwd(pwd);
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		ModelAndeView mav = new ModelAndeView("/WEB-INF/views/result.jsp");
		
		try {
			articleDAO.deleteArticle(articleVO);
			mav.addObject("msg", "글 삭제 성공");
			mav.addObject("url", "list");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "비밀번호가 틀립니다.");
			mav.addObject("url", "javascript:history.back()");
		}
		return mav;
	}

}
