package com.example.databaseAPI.Sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.databaseAPI.Dao.MainDao;
import com.example.databaseAPI.entity.Employee;

@Service
public class MainService {
    
	@Autowired
	MainDao dao;
	
	public void insertData(Employee employee) {
		dao.inserData(employee);
		
		
	}
}
