package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IEmployeeDAO;
import com.cg.dto.Employee;


@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDAO employeeDAO;

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.searchEmployee(empId);
	}
	

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.showAllEmployee();
	}

}
