package com.example.Department.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartmentEntity {
	@Id
	private int department_id;
	private String departmentName;
	

	
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
}
