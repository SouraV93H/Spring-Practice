package com.spring.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println(" Set price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init() {

		System.out.println("Inside init method");
	}

	public void destroy() {

		System.out.println("Inside destroy method");
	}

}
