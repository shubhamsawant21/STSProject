package com.example.demo.EmployeeServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Employeerepository;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private Employeerepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		 return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeebyid(Integer id) {
		       
		Employee employee =employeeRepository.findById(id).get();
		return employee;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		
		 employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> getByAddress(String address) {
		
		List<Employee> emp = employeeRepository.findByAddress(address);
		return emp;
	}

	
}
