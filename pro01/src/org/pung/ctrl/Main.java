package org.pung.ctrl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pung.dao.NoticeDAO;
import org.pung.dto.Notice;
import org.pung.dto.Qna;

@WebServlet("/pro01")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Main() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String author = "강사 김기태";
		ServletContext application = request.getServletContext();
		String realPath = request.getSession().getServletContext().getRealPath("/");
		application.setAttribute("realPath", realPath);
		application.setAttribute("title", "풍남동 소개");
				
		NoticeDAO ndao = new NoticeDAO();
		List<Notice> latestNotiList = ndao.getLatestNoticeList();
//		List<Qna> latestQnaList = new ArrayList<>();
		
		request.setAttribute("latestNotiList", latestNotiList);
//		request.setAttribute("latestQnaList", latestQnaList);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}
}