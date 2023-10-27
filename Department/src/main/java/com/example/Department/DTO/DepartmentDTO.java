package com.example.Department.DTO;

import javax.persistence.Id;


public class DepartmentDTO {
	
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
	
	
	@Override
	public String toString() {
		return "DepartmentDTO [department_id=" + department_id + ", departmentName=" + departmentName + "]";
	}
	
	
	
	
	
	
	
}
