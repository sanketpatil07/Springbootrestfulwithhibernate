package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.ServiceI;

@RestController
public class EmployeeController {

	@Autowired
	private ServiceI servicei;
	
	@PostMapping(value = "/add",consumes = "application/json")
	public ResponseEntity<Employee> addEmployyee( @RequestBody  Employee emp) {
	
		Employee addEmployee = servicei.AddEmployee(emp);
		

			return new ResponseEntity<Employee>(addEmployee,HttpStatus.CREATED);
		}
	
	@GetMapping(value="/getdata" ,produces="application/json")
	public ResponseEntity<List<Employee>> getalldata(){
		
		List<Employee> getalldata = servicei.getalldata(null);
		if(getalldata != null)	{
			return new ResponseEntity<List<Employee>>(HttpStatus.OK);
		}
		return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		
	}
	
	
	
	
	}
	
	
