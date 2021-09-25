package com.spring.springexp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springexp/config.xml");
		
		Student s1 =context.getBean("student" ,Student.class);
		System.out.println(s1);

	}

}
