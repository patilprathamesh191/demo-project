package com.example.model;

public class Employee {
	
	private String name;
	private String dept;
	private Long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
