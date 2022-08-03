package com.businesslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletDemo() {
        super();
        
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter out  = res.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		
		if(username.equalsIgnoreCase("Abhinav") && password.equals("Abhi123")) {
			
			rd = req.getRequestDispatcher("Dashboard");
			rd.forward(req, res);
		}
		else {
			out.println("<h2 style='color:red; text-align:center; margin-top: 20px;'>Invalid Username or password !</h2>");
			rd.include(req, res);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
