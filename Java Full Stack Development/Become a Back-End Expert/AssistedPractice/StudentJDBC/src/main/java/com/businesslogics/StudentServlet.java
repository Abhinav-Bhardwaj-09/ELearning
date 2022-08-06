package com.businesslogics;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		String name = req.getParameter("name");
		int marks = Integer.parseInt(req.getParameter("marks"));
		
		try {
			Connection con = DBConnection.getDBConnection();		//Establishing connection
			
			String querry = "Insert into studentdetails(rollno,name,marks) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(querry);
			
			ps.setInt(1,  rollno);
			ps.setString(2,  name);
			ps.setInt(3, marks);
			
			int result = ps.executeUpdate();
			
			PrintWriter out = res.getWriter();
			
			
			if(result > 0) {
				out.println("Record inserted successfully.");
			}
			else {
				out.println("Record cannot be inserted !");
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}






















