package pl.coderslab.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet4AllQuotes
 */
@WebServlet("/allquotes")
public class Servlet4AllQuotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		getServletContext().getRequestDispatcher("/views/allquotes.jsp").forward(request, response);
		/*// access the List from the session
		HttpSession session = request.getSession();
		List<Quote> quoteList = (List<Quote>) session.getAttribute("quoteList");
		
		if(quoteList != null) {
			// process the list and set 			
			
			
		} else {
			
			// set message "No quotes in the list"
		}*/
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
