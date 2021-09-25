package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		
		return i;
		
	}
	
public int update(Student student) {
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		
		return i;
		
	}
public Student getStudent(int id) {
	
	Student student= this.hibernateTemplate.get(Student.class, id);
	
	return student;
}

public List<Student> getAllStudent() {
	
	List<Student> students= this.hibernateTemplate.loadAll(Student.class);
	
	return students;
}
//delete 
@Transactional
public void deleteStudent(int id) {
	
	Student student= this.hibernateTemplate.get(Student.class, id);
	
	this.hibernateTemplate.delete(student);

}

//update
@Transactional
public Student updateStudent(int id) {
	
	Student student= this.hibernateTemplate.get(Student.class, id);
	this.hibernateTemplate.update(student);
	
	return student;
}

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

}
