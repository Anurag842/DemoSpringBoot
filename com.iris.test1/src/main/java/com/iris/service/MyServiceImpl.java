package com.iris.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.iris.entities.Employee;
import com.iris.repository.EmployeeRepository;

public class MyServiceImpl implements MyService {

	@Autowired
	EmployeeRepository dao;
	
	@Override
	public Employee addNewEmployee(Employee emp) {
		return  dao.save(emp);
	}

	
	

}
