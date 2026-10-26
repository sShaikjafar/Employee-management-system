package com.nec.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nec.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long>{
 
  	
}
