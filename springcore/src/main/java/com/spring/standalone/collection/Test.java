package com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone/collection/aloneconfig.xml");
		Person p1 = (Person) context.getBean("p1", Person.class);
		
		System.out.println(p1);

		System.out.println();
		System.out.println(p1.getFeestructure().getClass().getName());
	}

}
