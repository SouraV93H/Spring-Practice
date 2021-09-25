package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		
		Samosa s1 = (Samosa) context.getBean("s1");
		
		System.out.println(s1);
		context.registerShutdownHook();
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		
		System.out.println(p1);
		
		Cheips c1 = (Cheips) context.getBean("c1");
		System.out.println(c1);

	}
}
