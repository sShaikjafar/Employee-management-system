package com.nec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nec.Entity.Employee;
import com.nec.repository.EmpRepository;

@Service
public class EmpServiceImp implements EmpService {

	@Autowired
	private EmpRepository repository;
	
	@Override
	public Employee addEmployee(Employee emp) {
	    
		return repository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Long id,Employee emp) {
		
		Employee existing = repository.findById(id).orElse(null);
		if(existing!=null) {
			existing.setName(emp.getName());
			existing.setDepartment(emp.getDepartment());
			existing.setSalary(emp.getSalary());
			return repository.save(existing);
		}
		
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		
		repository.deleteById(id);
	}

}
