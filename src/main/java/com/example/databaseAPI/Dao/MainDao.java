package com.example.databaseAPI.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.databaseAPI.entity.Employee;

@Repository
public class MainDao {

	@Autowired
	SessionFactory factory;
	
	public void inserData(Employee employee) {
		Session session=factory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
		}
}
