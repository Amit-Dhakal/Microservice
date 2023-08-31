package com.example.Employee.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Component
public class EmployeeEntity {
	
	private long employee_id;
	private String employee_name;
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	
	
	
	

}
