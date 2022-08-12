package com.example.Dao;

import java.util.List;

import com.example.model.Employee;

public interface DaoI {

	public Employee AddEmployee(Employee emp);
	
   public List<Employee> getalldata(List<Employee> emp);
	
	//public List<Employee> addmultiEmployee(Employee emp);
}
