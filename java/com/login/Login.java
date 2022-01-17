package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.loginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");	
		
		loginDao ld = new loginDao();
		
		if(ld.checkDetails(email, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

}
