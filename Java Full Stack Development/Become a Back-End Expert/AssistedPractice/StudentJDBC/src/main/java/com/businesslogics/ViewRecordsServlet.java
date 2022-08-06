package com.businesslogics;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewRecordsServlet")
public class ViewRecordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			Connection con = DBConnection.getDBConnection();
			
			String querry = "Select * from studentdetails";
			
			Statement ps = con.createStatement();
			
			ResultSet result = ps.executeQuery(querry);
			
			PrintWriter out = res.getWriter();
			
			out.println("<table border=2>");
			out.println("<tr><th>RollN\no</th><th>Name</th><th>Marks</th></tr>");
			
			while(result.next()) {
				out.println("<tr>");
				out.println("<td>" + result.getInt("rollno") + "</td>");
				out.println("<td>" + result.getString("name") + "</td>");
				out.println("<td>" + result.getInt("marks") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}








































