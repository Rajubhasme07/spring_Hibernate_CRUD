package com.example.demo;


import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.controller.StudentDao;

import com.example.demo.model.Student;

@SpringBootApplication
public class SpringHibernateJdbcCrudApplication {

	public static void main(String[] args) {

		
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	StudentDao dao=(StudentDao) context.getBean("s");
	
	
	Student d;
	
	int uroll;
	String sname;
	String sadd;
	String sph;
	
	Scanner sc=new Scanner(System.in);
	
	int i=1;
	
	while(i==1)
	
{
	System.out.println("1.Add Student");
	
	System.out.println("2.show Student");
	System.out.println("3.Delete Student");
	System.out.println("4.Update Student");
	System.out.println("0.Exit");
	System.out.println("Enter Your Choice:");

	int choice=Integer.parseInt(sc.nextLine());
	
switch(choice)
{
case 1:
	System.out.println("Enter Roll No:"); 
	int roll=Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter the Student Name:");
	sname=sc.nextLine();
	
	System.out.println("Enter the Student Address:");
	sadd=sc.nextLine();
	
	System.out.println("Enter the Student Phone:");
	sph=sc.nextLine();
	
	d=new Student(roll,sadd,sname,sph);
	dao.saveStudent(d);
	
	System.out.println("Data inserted !");
	break;
	
case 2: 
	
//	System.out.println(":Total Customer:");
//
//	List<Customer> list=dao.getCustomer();
//	
//	for(Customer c1:list) 
//	{
//		System.out.println(c1);
//	}
//	
	break;
case 3:
	
	System.out.println("Enter The Roll NO You want to Delete :");
	uroll=Integer.parseInt(sc.nextLine());
	
		d=new Student(uroll);
		
		dao.deleteStudent(d);
		
	System.out.println("Data Deleted Successfully !");
	break;
	
case 4:
	
	System.out.println("What do you want to update");
	System.out.println("1.Name");
	System.out.println("2.Address");
	System.out.println("2.Phone");
	int uch=Integer.parseInt(sc.nextLine());
	
	if(uch==1) {
		
		 System.out.println("Enter The Roll no You want to Update :"); 
		 uroll=Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Enter Updated Name"); 
		 sname=sc.nextLine();
	
		 dao.updatename(uroll, sname);
	
		  System.out.println("Data updated Successfully");
	
	}
	else if(uch==2) {
		
		
		 System.out.println("Enter The Roll No You want to Update :"); 
		 uroll=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter Updated Address"); 
		 sadd=sc.nextLine();
		

		 dao.updateadd(uroll, sadd);
		 
		  System.out.println("Data updated Successfully");
	
	}
	else if(uch==3) {
		
		
		 System.out.println("Enter The Roll No You want to Update :"); 
		 uroll=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter Updated Address"); 
		 sph=sc.nextLine();
	
		 dao.updateph(uroll, sph);
		 
		  System.out.println("Data updated Successfully");
	
	}
	
	
	
	break;
	default :
		System.out.println("Invalid Credential");
	case 0:
		System.out.println("thank You");
		break;

}
	}	
		
	}

}
