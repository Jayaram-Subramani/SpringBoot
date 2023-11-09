package com.example.demo123.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo123.model.Employee;
import com.example.demo123.service.Employee_service;

@RestController
@RequestMapping("/employee")



public class EmployeeController {
	
	@Autowired
	private Employee_service empService;
	
	
	@PostMapping("/create")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.saveEmp(emp);
		
	}
	@GetMapping("/list")
	public List<Employee> getAllEmp(){
    	return empService.getAllEmp();
    }

    @GetMapping("/custom")
    public List<Employee> getAllEmp1(){
	   return empService.customizedQuery();
    }
	
	@PostMapping("/find")
	public Employee fingEmp(@RequestBody Employee emp){
    	return empService.getById(emp);
    }
    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee emp) {
    	return empService.updateEmployee(emp);
    }
    @DeleteMapping("/delete")
    public String deleteEmp(@RequestBody Employee emp) {
    	return empService.delteEmployee(emp);
    }
}
