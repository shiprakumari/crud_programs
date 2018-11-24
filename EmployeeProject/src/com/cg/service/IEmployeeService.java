package com.cg.service;

import java.util.List;

import com.cg.dto.Employee;

public interface IEmployeeService {
	
	public boolean updateEmployee(Employee employee);
	public Employee  searchEmployee(int empId);
	public List<Employee> showAllEmployee();

}
