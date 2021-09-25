package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cheips {
private double price;

public Cheips() {
	super();
	// TODO Auto-generated constructor stub
}

public Cheips(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Cheips [price=" + price + "]";
}

@PostConstruct
public void start() {
	System.out.println("Starting Method");
}
@PreDestroy
public void end() {
	System.out.println("Ending Method");
}
}
