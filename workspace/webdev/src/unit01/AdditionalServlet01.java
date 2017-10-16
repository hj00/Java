package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/AdditionalServlet01")
public class AdditionalServlet01 extends HttpServlet {
	// private static final long serialVersionUID = 1L; 각 클래스마다 Serial VersionUID로 관리(분산업무시스템으로 인한 단점 보완 위해?)
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /*
	public AdditionalServlet01() {
        super();
        // TODO Auto-generated constructor stub
    } 단순 생성자 지금 필요 없음.
    */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		response.setContentType("text/htm;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("doget 수행중");
		String name = request.getParameter("name");
		out.println("그래, 난 " + name + ". 포기를 모르는 남자지");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("doPost 수행중");
		String name = request.getParameter("name");
		out.println("그래, 난 " + name + ". 포기를 모르는 남자지");
		out.close();
	}

}
