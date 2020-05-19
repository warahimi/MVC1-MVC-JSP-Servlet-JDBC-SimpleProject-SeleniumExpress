package com.codesmart.foodcart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FootCart")
public class FootCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1st our controller is going get the data from the database(model)
		//2nd it redirect the data to a page (view)
		
		
		//before redirecting to a page we can set some data with our request object to be sent to view.
		//Note: one of the problems working with JDBC is that we get a lot of throws and exception
		try {
			List<Food> foodItems = FoodCartDBUtil.getFoodList();
			request.setAttribute("foodItems", foodItems); // to send this data to the jsp page
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		//to redirect to a view or page we use the requestdispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}
