package com.mtz.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.emp.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
