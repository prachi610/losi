package com.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.registerDao;

@WebServlet("/Register")
public class register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String uname = request.getParameter("name");
		String pass = request.getParameter("password");	
		
		registerDao rd = new registerDao();
		String s = rd.insertDetails(email,pass,uname);
		if(s.equals("successful")) {
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("error.html");
		}
		
	}

}
