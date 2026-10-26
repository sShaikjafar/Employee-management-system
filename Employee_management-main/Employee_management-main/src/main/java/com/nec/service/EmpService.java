package com.nec.service;
import java.util.List;

import com.nec.Entity.Employee;

public interface EmpService {
 
	Employee addEmployee(Employee emp);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(Long id);
	Employee updateEmployee(Long id,Employee emp);
	void deleteEmployee(Long id);
	
	
}
