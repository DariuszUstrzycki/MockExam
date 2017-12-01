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
 * Servlet implementation class Servlet4
 */
@WebServlet("/addquote")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//access or create the List
		HttpSession session = request.getSession();
		List<Quote> quoteList = (List<Quote>) session.getAttribute("quoteList");
		
		if(quoteList == null) {
			quoteList = new ArrayList<>();
		}
		
		//get the parameters from the form
		String author = request.getParameter("author");
		String quote = request.getParameter("quote");
		
		//create new quote and add to the List
		quoteList.add(new Quote(author, quote));
		//(re)set the List on the session
		session.setAttribute("quoteList", quoteList);
		
		//forward to add another quote
		getServletContext().getRequestDispatcher("/views/addquote.jsp").forward(request, response);;
		
	}

}
