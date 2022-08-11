package com.ProductDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pName = request.getParameter("pName");
		long pPrice = Long.parseLong(request.getParameter("pPrice"));
		int pQty = Integer.parseInt(request.getParameter("pQty"));
		
		Product prod = new Product();
		prod.setpName(pName);
		prod.setpPrice(pPrice);
		prod.setpQty(pQty);
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("pName", prod.getpName());
		session.setAttribute("pPrice", prod.getpPrice());
		session.setAttribute("pQty", prod.getpQty());
		
		
		PrintWriter out = response.getWriter();
		
		out.print("<a href='showProductDetails.jsp'>Show Product Details</a>");
	}
}
