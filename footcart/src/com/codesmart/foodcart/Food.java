package com.codesmart.foodcart;

//this is a POJO class, ( a simple jave class with no features)
public class Food {
	//Make all your varibles private inside your POJO classes
	private int id;
	private String item;
	private double price;
	
	//Constructors
	public Food() {
		
	}

	public Food(int id, String item, double price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}

	//Getters and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
