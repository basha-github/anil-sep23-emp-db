package com.mtz.emp.service;

import java.util.List;

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

	public List<Employee> getAllEmps() {
		return empRepo.findAll();
	}

	public Employee updateEmp(Employee emp) {

		Employee dbEmp = null;
		try {
			dbEmp = empRepo.findById(emp.getEid()).get();
			if (dbEmp != null) {
				return empRepo.save(emp);
			}
		} catch (Exception e) {

		}

		return dbEmp;

	}

	public String deleteEmp(int id) {
		Employee dbEmp = null;
		String res = "Successfully Deleted record-->"+id;
		try {
			dbEmp = empRepo.findById(id).get();
			if (dbEmp != null) {
				empRepo.deleteById(id);
			}
			else {
				res = "falied to delete record--->"+id;
			}
				
		}catch(Exception e) {
			res = "falied to delete record--->"+id;
		}
		
		return res;
	}

}
