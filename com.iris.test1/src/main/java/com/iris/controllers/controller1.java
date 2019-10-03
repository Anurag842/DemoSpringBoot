package com.iris.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iris.entities.Employee;
import com.iris.service.MyService;

@RestController
public class controller1 {


    @Autowired
    MyService service;
	
	 
	 @RequestMapping("/")                   // it will handle all request for /welcome
	    public String SpringBootHello() {
		 System.out.println("...............................................");
		 Employee emp=new Employee();
		 emp.setName("Rounak");
		 emp.setDepartment("IT");
		 emp.setSalary(20000);
		 Employee e=service.addNewEmployee(emp);
		System.out.println( e.getId()+"...................................."+e.getName());
		System.out.println(service.showEmployee(2));
		
		 
		 
	        return "welcome";           // welcome is view name. It will call welcome.jsp
	    }
}
