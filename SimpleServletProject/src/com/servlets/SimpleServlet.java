package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		response.setContentType("text/html");
		
		String[] userHobbies = request.getParameterValues("userHobbies");
		
		String gender = request.getParameter("gender");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<p> Hello, "+username + "</p>");
		
		if(userHobbies!=null){
			
			writer.print("<p> Your hobbies are: ");
		
			for(int i=0; i<userHobbies.length; i++){
				
				writer.print(userHobbies[i]+", ");
				
			}
			
			writer.print("</p>");
			
		}
		
		else {
			
			writer.print("<p>You didnt select any hobbies!!!</p>");
		}
		
		writer.print("<p>You specified your gender as "+gender+"</p>");
			
	}

}
