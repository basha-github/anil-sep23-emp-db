package com.mtz.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.emp.model.Employee;
import com.mtz.emp.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo empRepo;

	public Employee addNewEmp(Employee emp) {
		
		return empRepo.save(emp);
		
		
	}

}
