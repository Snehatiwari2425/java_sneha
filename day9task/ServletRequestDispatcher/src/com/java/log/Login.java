package com.java.log;

import java.io.IOException;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;


public class Login extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter  out=response.getWriter();
		
		String n=request.getParameter("Uname");
		String p=request.getParameter("Pass");
		
		if(p.equals("match"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else{
			out.println("sorry username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
