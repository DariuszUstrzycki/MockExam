package pl.coderslab.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/homepage")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String consent = request.getParameter("cookies"); 
		
		if(consent!= null && consent.equals("yes")) {
			addCookie("CookieConsent", "yes", 24*360, response);
		} 
		response.sendRedirect("/JEE_Exam_3/views/homepage.jsp");
	}

	private void addCookie(String cookieName, String cookieValue, int hours, HttpServletResponse response) throws IOException {

		Cookie c = new Cookie(cookieName, cookieValue);
		c.setMaxAge(60 * 60 * hours);
		response.addCookie(c);
		//response.getWriter().append(("Cookie(" + cookieName + ", " + cookieValue + ") has been added." ));
	}

}
