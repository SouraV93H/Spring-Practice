package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean(name = {"ds"})
	public DriverManagerDataSource ds() {
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
		
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(ds());
		return jdbcTemplate;
		
		
	}
//	@Bean(name = {"studentDao"})
//	public StudentDao studentDao() {
//		
//		StudentDaoImp studentDao= new StudentDaoImp();
//		
//		studentDao.setJdbcTemplate(jdbcTemplate());
//		
//		return studentDao;
//		
//	}

}
