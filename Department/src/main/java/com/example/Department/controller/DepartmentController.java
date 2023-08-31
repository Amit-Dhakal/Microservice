package com.example.Department.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Department.model.DepartmentEntity;
import com.example.Department.repo.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentRepo;
	
	
	
	
private static final Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/add")
	public void save(@RequestBody DepartmentEntity departmentEntity ) {	
		departmentRepo.saveDepartmentData(departmentEntity);		
	}
	
	
	
	@GetMapping("/getalldepartments")
	public List<DepartmentEntity> getDepartment(){
			
	return departmentRepo.findAll();
		
	}
	
	
	
}
