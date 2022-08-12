package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.DaoI;
import com.example.model.Employee;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	private DaoI daoi;

	@Override
	public Employee AddEmployee(Employee emp) {
		Employee addEmployee = daoi.AddEmployee(emp);
		return addEmployee;
	}

	@Override
	public List<Employee> getalldata(List<Employee> emp) {

		List<Employee> getalldata = daoi.getalldata(emp);
		
		
		return getalldata;
	}

//	@Override
//	public List<Employee> addmultiEmployee(Employee emp) {
//
//		//List<Employee> addmultiEmployee = daoi.addmultiEmployee(emp);
//		
//		
//		return addmultiEmployee;
//	}

	
	}
	
	
	

