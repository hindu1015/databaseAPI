package com.example.databaseAPI.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.databaseAPI.Sevice.MainService;
import com.example.databaseAPI.entity.Employee;

@RestController
@RequestMapping(value="EmployeeAPI")
public class MainControler {
  
	@Autowired
	MainService service;
	
	//localhost:8080/EmployeeAPI/employee
	@PostMapping(value="employee")
	public void addemployeeData(@RequestBody Employee employee) {
		System.out.println(employee);
		service.insertData(employee);
		System.out.println("employee data inserted---");
	}
}
