package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Ram")
private String studentName;
	@Value("Delhi")
private String city;

@Value("#{temp}")	
private List<String> addresss;
	
	
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String studentName, String city) {
	super();
	this.studentName = studentName;
	this.city = city;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


public List<String> getAddresss() {
	return addresss;
}
public void setAddresss(List<String> addresss) {
	this.addresss = addresss;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}


}
