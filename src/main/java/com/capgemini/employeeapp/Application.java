package com.capgemini.employeeapp;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.employeeapp.config.AppConfig;
import com.capgemini.employeeapp.entities.Employee;
import com.capgemini.employeeapp.exception.EmployeeNotFoundException;
import com.capgemini.employeeapp.repository.EmployeeRepository;


public class Application {
     public static void main(String[] args) throws EmployeeNotFoundException {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");*/
    	 
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeRepository EmployeeRepository = context.getBean("EmployeeRepository", EmployeeRepository.class);
		
		System.out.println(EmployeeRepository.addEmployee(new Employee(34,"swathi","ECE",50000)));
		
		//System.out.println(EmployeeRepository.updateEmployee(new Employee(45,"chaitanya","EEE",90000)));
		//System.out.println(EmployeeRepository.deleteEmployee(1234));
	
	

		
		/*DbUtil dbutil = context.getBean(DbUtil.class);
		dbutil.getConnection();*/

	}
}