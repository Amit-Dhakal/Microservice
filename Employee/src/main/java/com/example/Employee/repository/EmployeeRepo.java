package com.example.Employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Employee.model.EmployeeEntity;

@Repository
public class EmployeeRepo {
	
	
	private List<EmployeeEntity> listEmp=new ArrayList<EmployeeEntity>();
	
	public EmployeeEntity addEmp(EmployeeEntity employeeEntity) {
			
		listEmp.add(employeeEntity);	
		return employeeEntity;
	}
	
	
	
	
	
	public List<EmployeeEntity> getAllEmployee() {
		
		
		
		return listEmp;
		
	}

	
	
	
}
