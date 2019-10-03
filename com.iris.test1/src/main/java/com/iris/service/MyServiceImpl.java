package com.iris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.entities.Employee;
import com.iris.repository.EmployeeRepository;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	EmployeeRepository dao;
	
	@Override
	public Employee addNewEmployee(Employee emp) {
		System.out.println("inside myserviceimpl");
		return  dao.save(emp);
	}

	@Override
	public boolean showEmployee(int id) {
		// 
		
		return dao.existsById(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
