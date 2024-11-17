package com.AkshatSharma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AkshatSharma.Entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	//All CURD Operation

}
