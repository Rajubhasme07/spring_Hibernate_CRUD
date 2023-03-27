package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stu_info")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	
	@Column
	private String sname;
	
	@Column
	private String sadd;
	
	@Column
	private String sph;
	
	


	public Student(String sname, String sadd, String sph) {
		super();
		this.sname = sname;
		this.sadd = sadd;
		this.sph = sph;
	}


	public Student(int roll, String sname, String sadd, String sph) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.sadd = sadd;
		this.sph = sph;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", sadd=" + sadd + ", sph=" + sph + "]";
	}


	

	public Student(int roll) {
		super();
		this.roll = roll;
	}


	public int getroll() {
		return roll;
	}


	public void setroll(int roll) {
		this.roll = roll;
	}


	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getSph() {
		return sph;
	}
	public void setSph(String sph) {
		this.sph = sph;
	}
	
	
}
