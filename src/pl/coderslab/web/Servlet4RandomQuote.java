package pl.coderslab.web;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet4RandomQuote
 */
@WebServlet("/randomquote")
public class Servlet4RandomQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// get the List from the session
		HttpSession session = request.getSession();
		List<Quote> quoteList = (List<Quote>) session.getAttribute("quoteList");
		int noOfquotes = -1;
		
		if(quoteList == null) {
			noOfquotes = quoteList.size();
			int max = noOfquotes -1;
			int min = 0;
			int index = new Random().nextInt((max - min) + 1) + min;
			Quote randomQuote = quoteList.get(index);
			
			session.setAttribute("randomQuote", randomQuote);
		}
	}
	
	
}
