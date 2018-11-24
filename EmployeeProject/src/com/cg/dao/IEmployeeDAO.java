package com.cg.dao;

import java.util.List;

import com.cg.dto.Employee;

public interface IEmployeeDAO {
	public List<Employee> showAllEmployee();
	public boolean updateEmployee(Employee employee);
	public Employee  searchEmployee(int id);
}
