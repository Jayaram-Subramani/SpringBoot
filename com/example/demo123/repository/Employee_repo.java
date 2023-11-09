package com.example.demo123.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo123.model.Employee;

@Repository

public interface Employee_repo extends JpaRepository<Employee, Integer> {
	@Query(value = "SELECT * FROM employee e where e.emp_name='jaya'",nativeQuery=true)
	    List<Employee>findAllSortedByName();

}
