package com.nec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.Entity.Employee;
import com.nec.service.EmpService;


@RestController
@RequestMapping("/api/emp")
public class EmpController {
	
	@Autowired
    private EmpService service; 
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@GetMapping()
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee  getEmployeeById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee emp) {
		return service.updateEmployee(id, emp);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
	}
	
}
