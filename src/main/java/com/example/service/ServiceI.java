package com.example.service;


import java.util.List;

import com.example.model.Employee;


public interface ServiceI {

	public Employee AddEmployee(Employee emp);
	
	//public List<Employee >addmultiEmployee(Employee emp);
	
	public List<Employee> getalldata(List<Employee> emp);
}
