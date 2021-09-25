package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student =new Student(12, "Ramsas", "Burdwan");
//       int r =  studentDao.insert(student);
		System.out.println("***************Welcome to our Project******************");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {

			System.out.println("Press 1 for add Student");
			System.out.println("Press 2 for display all Student");
			System.out.println("Press 3 for display single Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for update Student");
			System.out.println("Press 6 for Exit");

			try {

				int ch = Integer.parseInt(br.readLine());
				switch (ch) {
				case 1:
					System.out.println("Enter the student id");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter the student name");
					String uName = br.readLine();
					System.out.println("Enter the student city");
					String uCity = br.readLine();

					Student student2 = new Student();
					student2.setId(uId);
					student2.setStudentName(uName);
					student2.setStudentCity(uCity);
					int r = studentDao.insert(student2);

					System.out.println(r + "Student added");

					System.out.println("****************************************");
					System.out.println();
					break;
				case 2:
					List<Student> students = studentDao.getAllStudent();
					for (Student student21 : students) {
						System.out.println("ID - " + student21.getId() + " Name - " + student21.getStudentName()
								+ " city - " + student21.getStudentCity());
					
					}

					System.out.println("****************************************");
					System.out.println();
					break;

				case 3:
					System.out.println("Enter the student id");
					int uId1 = Integer.parseInt(br.readLine());
					Student student21 = studentDao.getStudent(uId1);
					System.out.println("ID - " + student21.getId() + " Name - " + student21.getStudentName()
					+ " city - " + student21.getStudentCity());

					break;

				case 4:
					System.out.println("Enter the student id");
					int uId11 = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(uId11);
					
					System.out.println(uId11 + " Deleted...");
					break;

				case 5:
					System.out.println("Enter the student id");
					int uId111 = Integer.parseInt(br.readLine());
					
					System.out.println("Enter the student name");
					String uName1 = br.readLine();
					System.out.println("Enter the student city");
					String uCity1 = br.readLine();
					Student student6 = studentDao.updateStudent(uId111);
					student6.setStudentName(uName1);
					student6.setStudentCity(uCity1);
					int r1 = studentDao.update(student6);
					System.out.println(r1 + "Student updated");
					
					break;
				case 6:
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid input");
			}

		}
	}

}
