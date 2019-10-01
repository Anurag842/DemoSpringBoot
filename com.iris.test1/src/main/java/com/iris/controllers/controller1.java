package com.iris.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	 @RequestMapping(value= "/employee/add", method= RequestMethod.POST)
	    public Employee createEmployee(@RequestBody Employee newemp) {
	        System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
	        return service.addNewEmployee(newemp);
	    }
	
}
