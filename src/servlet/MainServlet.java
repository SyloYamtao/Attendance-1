package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String random_word = request.getParameter("random_word");
		request.setCharacterEncoding("UTF-8");
		
		request.setAttribute("random_word",random_word);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/attendance.jsp");
		dispatcher.forward(request, response);
	}
}
