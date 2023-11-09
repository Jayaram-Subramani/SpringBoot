package com.example.demo123.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="employee")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String em_name;
	
	@Column(name="emp_age")
	private int age;
	
	@Column(name="emp_mobile_num")
	private String mob;
	
	@Column(name="emp_address")
	private String em_adress;
	
	public Employee() {}
	
	
	

	public Employee(int i, String string, int j, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.em_name=string;
		this.age=j;
		this.mob=string2;
		this.em_adress=string3;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", em_name=" + em_name + ", age=" + age + ", mob=" + mob + ", em_adress="
				+ em_adress + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEm_name() {
		return em_name;
	}

	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEm_adress() {
		return em_adress;
	}

	public void setEm_adress(String em_adress) {
		this.em_adress = em_adress;
	}
}
