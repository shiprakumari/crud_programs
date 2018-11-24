package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.dto.Employee;


@Repository("employeeDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@PersistenceContext
	EntityManager emf;
	


	@Override
	public boolean updateEmployee(Employee employee) {
		try{
			emf.merge(employee);
			emf.flush();
			return true;
		}
		catch(Exception e){
			return false;
		}
	
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		Employee employee=emf.find(Employee.class, empId);
		return employee;
	}
	
	
	@Override
	public List<Employee> showAllEmployee() {
	Query queryone= emf.createQuery("FROM Employee");
	List<Employee> myList = queryone.getResultList();
		return myList;
	}

	
}
