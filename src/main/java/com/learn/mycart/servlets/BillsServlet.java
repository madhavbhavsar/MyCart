package com.learn.mycart.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.mycart.entities.Bills;
import com.learn.mycart.helper.FactoryProvider;

/**
 * Servlet implementation class BillsServlet
 */
public class BillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String billName= request.getParameter("order_name");
			String billEmail= request.getParameter("order_email");
			String billPhone= request.getParameter("order_phone");
			String billAdd= request.getParameter("order_add");
			
			String billItems = request.getParameter("order_items_names");
			String billItemsq = request.getParameter("order_items_quantity");
			String billItemsp = request.getParameter("order_items_price");
			String billItemstp = request.getParameter("order_items_tprice");
			
			Bills bill = new Bills(billName, billEmail,billAdd,billPhone, billItems,billItemsq,billItemsp,billItemstp);
			Session hibernateSession=FactoryProvider.getFactory().openSession();
			Transaction tx= hibernateSession.beginTransaction();
			int billId=(Integer) hibernateSession.save(bill);
			
			
			
			tx.commit();
			hibernateSession.close();
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("message","*Order SuccessFul !! User Order id is:" + billId);
			response.sendRedirect("checkout.jsp");
			return;
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
