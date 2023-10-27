package com.example.Department.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.Department.DTO.DepartmentDTO;
import com.example.Department.model.DepartmentEntity;

@Repository
public class DepartmentRepository{
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public List<DepartmentDTO> listDepartment=new ArrayList<DepartmentDTO>();
		

	public DepartmentDTO saveDepartmentData(DepartmentDTO department) {
			
		listDepartment.add(department);
		return department;
		}
	
	
	
	public List<DepartmentDTO> findAll() {
		
		
		ArrayList<String> arrayList=restTemplate.getForObject("http://localhost:8082/employee/getemployee",ArrayList.class);
		
		System.out.println(arrayList);
		return listDepartment;
		
	}
	
	
	
	
}
