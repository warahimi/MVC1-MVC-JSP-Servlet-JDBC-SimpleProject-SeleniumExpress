package com.codesmart.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//This is a helper class who talk to model and get data for us
public class FoodCartDBUtil {
	//wiret a method to fetch all the data from DB
	public static List<Food>getFoodList() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/food?allowPublicKeyRetrieval=true&useSSL=false";
		String userName = "hbstudent";
		String password = "hbstudent";
		
		ArrayList<Food> foods = new ArrayList<>();
		
		//Load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//get the connection
		Connection con =DriverManager.getConnection(url, userName, password);
		
		//create a statement
		Statement stmt = con.createStatement();
		//extecute the statement and loop over the resultset
		ResultSet rs = stmt.executeQuery("select * from foodcart");
		
		while(rs.next())
		{
			int id = rs.getInt(1);
			String item = rs.getString(2);
			double price = rs.getDouble(3);
			
			//create the POJO class (Food) object and add the object to the ArrayList
			Food f = new Food(id, item, price);
			foods.add(f);
			
		}
		
		
		return foods;
	}
	
	//next use this method inside the controller, so the controler could get the data from database with the help of this method
}
