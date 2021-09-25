package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDaoImp;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    
    {  System.out.println("PRogramming started....");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student student = new Student();
//        student.setId(11);
//        student.setName("Rajj");
//        student.setCity("ABC");
//        int result = studentDao.change(student);
        
        
//        Scanner sc=new Scanner(System.in);  
//        System.out.print("Enter id number- ");  
//        int a= sc.nextInt();  
//        Student student = new Student();
//        student.setId(a);
//        int result = studentDao.delete(student);
//        
//        
//        System.out.println("data deleted "+result);
        
        
        List<Student> students= studentDao.getAllStudent();
        
      for (Student student : students) {
		System.out.println(student);
	}
    }
}
