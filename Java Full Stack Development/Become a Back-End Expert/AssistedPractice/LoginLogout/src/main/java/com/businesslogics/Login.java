package com.businesslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter out  = res.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("LoginPage.html");
		
		if(username.equalsIgnoreCase("Abhinav") && password.equals("Abhi123")) {
			HttpSession session = req.getSession(true);
			session.setAttribute("username", username);
			
			rd = req.getRequestDispatcher("Dashboard");
			rd.forward(req, res);
		}
		else {
			out.println("<h2 style='color:red; text-align:center; margin-top: 20px;'>Invalid Username or password !</h2>");
			rd.include(req, res);
		}
	}

}
