package com.example.demo.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.Student;
import com.mysql.cj.Query;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int saveStudent(Student s) {

		
		String query="insert into Stu_info values('"+s.getroll()+"','"+s.getSname()+"','"+s.getSadd()+"','"+s.getSph()+"')";  
	    return jdbcTemplate.update(query);  
	}
	
	
	public int deleteStudent(Student s){  
	    String query="delete from Stu_info where roll='"+s.getroll()+"' ";  
	    return jdbcTemplate.update(query);  
	}
	
	
	public int updateadd(int roll,String add) {
		String query="Update Stu_info set sadd='"+add+"' Where roll='"+roll+"'";
		return jdbcTemplate.update(query);
	}
	public int updatename(int roll,String name) {
		String query="Update Stu_info set sname='"+name+"' Where roll='"+roll+"'";
		return jdbcTemplate.update(query);
	}
	public int updateph(int roll,String phone) {
		String query="Update Stu_info set sph='"+phone+"' Where roll='"+roll+"'";
		return jdbcTemplate.update(query);
	}
	
//	
//	public List<Student> showStudent(Student s){  
//		List<Student> list=new ArrayList<Student>();
//	    String query="select * from Stu_info";  
//	    List<Student> sd=query.list();
//	    return list;
//	}  
	
	
	
	
}
