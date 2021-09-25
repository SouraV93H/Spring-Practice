package com.spring.springexp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{21*2}")
	private int x;
	
	@Value("#{23 * 2}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{ new String('Ram')}")
	private String name;
	
	@Value("#{new Boolean(True)}")
	private boolean bool;
	
	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Student(int x, int y, double z, String name) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", bool=" + bool + "]";
	}

}
