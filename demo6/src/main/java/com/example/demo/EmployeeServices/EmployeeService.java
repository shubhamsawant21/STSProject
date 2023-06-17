package com.example.demo.EmployeeServices;
import java.util.List;

import com.example.demo.model.Employee;


public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeebyid(Integer id);
	
	public void deleteEmployeeById(Integer id);
	
	public List<Employee> getByAddress(String address);
	


}
