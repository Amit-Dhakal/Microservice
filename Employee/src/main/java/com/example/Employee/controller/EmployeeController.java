package com.example.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.model.EmployeeEntity;
import com.example.Employee.repository.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo empRepo;
	
	@PostMapping("/add")
	public EmployeeEntity addEmp(@RequestBody EmployeeEntity employeeEntity) {
		
		
	
		return empRepo.addEmp(employeeEntity);
		

	}

	
	
	@GetMapping("/getemployee")
	public List<EmployeeEntity> listEmp() {
		
		
		return empRepo.getAllEmployee();
		

	}
	

}
