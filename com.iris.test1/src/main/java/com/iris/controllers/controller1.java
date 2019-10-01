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
	
	 @RequestMapping()
	    public Employee createEmployee(@RequestBody Employee newemp) {
	        System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
	        return service.addNewEmployee(newemp);
	    }
	 @RequestMapping("/welcome")                   // it will handle all request for /welcome
	    public String SpringBootHello() {
		 System.out.println("...............................................");
	        return "welcome.jsp";           // welcome is view name. It will call welcome.jsp
	    }
}
