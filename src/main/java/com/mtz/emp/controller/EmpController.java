package com.mtz.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.emp.model.Employee;
import com.mtz.emp.service.EmpService;

@RestController
public class EmpController {
	
	//EmpService empService = new EmpService();
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/mtz/emp/add")
	public Employee createEmp(@RequestBody Employee emp){
		
		return empService.addNewEmp(emp);
		
		
	}

}
