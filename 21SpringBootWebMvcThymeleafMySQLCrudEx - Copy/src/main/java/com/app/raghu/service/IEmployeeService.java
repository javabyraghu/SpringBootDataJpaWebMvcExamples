package com.app.raghu.service;

import java.util.List;

import com.app.raghu.entity.Employee;
import com.app.raghu.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id)
			throws EmployeeNotFoundException;
	Employee getOneEmployee(Integer id)
			throws EmployeeNotFoundException;
	List<Employee> getAllEmployees();
}
