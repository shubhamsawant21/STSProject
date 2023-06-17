package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee,Integer> {

	@Query(value="Select * from employee3 where address=?", nativeQuery=true)
	List<Employee> findByAddress(String address);

}
