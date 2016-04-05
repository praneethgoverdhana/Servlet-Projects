package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/userLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		if(username.equals("admin") && password.equals("admin")){
			
			writer.print("<p> Hurray!! Your login is successful!!! </p>");
			
		}
		
		else if(!username.equals("admin")){
			
			writer.print("<p> There is no user with that username!!! </p>");
			
		}
		
		else {
			
			writer.print("<p> Sorry!! You have entered wrong password!! </p>");
			
		}
		
		
		
	}

}
