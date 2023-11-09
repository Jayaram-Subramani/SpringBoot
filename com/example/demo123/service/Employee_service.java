package com.example.demo123.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo123.model.Employee;
import com.example.demo123.repository.Employee_repo;

@Service

public class Employee_service {
	@Autowired
	private Employee_repo empRepo;
	
	
	public Employee saveEmp(Employee emp) {
		return empRepo.save(emp);
	}
	public List<Employee> getAllEmp(){
    	return empRepo.findAll();
	}
    public Employee getById(Employee emp){
    	return empRepo.findById(emp.getId()).get();
    }
    	
    public String updateEmployee(Employee emp){
    	if(emp.getId()!=0 ) {
    		Employee getEmp=empRepo.findById(emp.getId()).get();
    		getEmp.setEm_name(emp.getEm_name());
    		getEmp.setAge(emp.getAge());
    		getEmp.setMob(emp.getMob());
    		getEmp.setEm_adress(emp.getEm_adress());
    		empRepo.save(getEmp);
    	}else {
    		return "unable to find";
    	}
         return "updated";
    }
    public String delteEmployee(Employee emp){
    	if(emp.getId()!=0 ) {
    		empRepo.deleteById(emp.getId());
    	}else {
    		return "unable to delete";
    	}
    	return "deleted successfully";
    }
    public List<Employee> customizedQuery(){
    	return empRepo.findAllSortedByName();
    	
    }
    
 
}
