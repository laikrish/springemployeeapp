package com.capgemini.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.employeeapp.entities.Employee;
import com.capgemini.employeeapp.repository.EmployeeRepository;
import com.capgemini.employeeapp.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository EmployeeRepository;

	/*
	 * public void setEmployeeRepository(EmployeeRepository EmployeeRepository) {
	 * this.EmployeeRepository = EmployeeRepository; }
	 */

	@Autowired

	private EmployeeServiceImpl(EmployeeRepository EmployeeRepository) {
		super();
		this.EmployeeRepository = EmployeeRepository;
		
	}


	@Override
	public Employee addEmployee(Employee employee) {

		return EmployeeRepository.addEmployee(employee);
	}
	@Override
	public Employee updateEmployee(Employee employee) {

		return EmployeeRepository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {

		return EmployeeRepository.deleteEmployee(employeeId);
	}
	@Override
	public Employee findEmployeeById(int employeeId) {

		return EmployeeRepository.findEmployeeById(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {

		return EmployeeRepository.findAllEmployees();
	}

	


}
