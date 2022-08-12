package com.example.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class DaoImpl implements DaoI{
	
	@Autowired
	private SessionFactory sf;

	@Override
	public Employee AddEmployee(Employee emp) {

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		return emp;
	}

	@Override
	public List<Employee> getalldata(List<Employee> emp) {

		Session session = sf.openSession();
		String hql=" from Employee";
		
		Query query = session.createQuery(hql);
		List list = query.getResultList();
		return list;
	}

		
	}


