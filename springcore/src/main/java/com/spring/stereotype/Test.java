package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		
		Student s1 = context.getBean("ob", Student.class);
		System.out.println(s1.hashCode());
		
		Student s2 = context.getBean("ob", Student.class);
		System.out.println(s2.hashCode());
		
		
		Teacher t1 = context.getBean("t1", Teacher.class);
		System.out.println(t1.hashCode());
		
		Teacher t2 = context.getBean("t1", Teacher.class);
		System.out.println(t2.hashCode());
	}

}
