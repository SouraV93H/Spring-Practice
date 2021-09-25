package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/javaconfig/config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

Student s1 = context.getBean("s1", Student.class);

System.out.println(s1);


	}

}
