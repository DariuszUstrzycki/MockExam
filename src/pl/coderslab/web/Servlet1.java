package pl.coderslab.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/receiver")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("hi");
		
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		int id = Integer.parseInt(request.getParameter("id"));
		
		out.append("Name:" + name + ", mail:" + mail + ", id:" + id);
		//getServletContext().getRequestDispatcher("views/index.js")
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("hello");
		
		doGet(request, response);
	}

}
