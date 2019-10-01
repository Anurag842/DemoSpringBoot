package com.iris.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.iris.entities.Employee;
import com.iris.repository.EmployeeRepository;



public interface MyService {
	
 public Employee addNewEmployee(Employee emp); 
 public Employee updateEmployee(Employee emp);
}
