package com.mtz.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PutMapping("/mtz/emp/update")
	public Employee updateEmp(@RequestBody Employee emp){
		
		return empService.updateEmp(emp);
		
		
	}
	@DeleteMapping("/mtz/emp/delete")
	public String deleteEmp(@RequestParam int id){
		
		return empService.deleteEmp(id);
		
		
	}
	
	@GetMapping("/mtz/emp/all")
	public List<Employee> getAllEmps(){
		
		return empService.getAllEmps();
		
		
	}
	

}
