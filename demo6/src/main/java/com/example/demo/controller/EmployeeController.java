package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeServices.EmployeeService;
import com.example.demo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")   //http://localhost:8085/employee/save
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
	Employee emp=employeeService.saveEmployee(employee);
	
	return ResponseEntity.ok().body(emp);
		}
	
	@GetMapping("/get/{id}")   //http://localhost:8085/employee/get/1
	public ResponseEntity<Employee> getEmployeebyid(@PathVariable("id") Integer id){
		
		Employee emp =employeeService.getEmployeebyid(id);
		return ResponseEntity.ok().body(emp);
		
	}
	
	@DeleteMapping ("/delete/{id}")         //http://localhost:8085/employee/delete/3
	public void deleteEmployeeById(@PathVariable("id") Integer id) throws Exception {
		
		employeeService.deleteEmployeeById(id);
		
		}
	
	@GetMapping("/getaddress/{address}")        //http://localhost:8085/employee/get/dubai
	public ResponseEntity<List<Employee>> getByAddress(@PathVariable ("address") String address)throws Exception{
		
	List<Employee> employee =employeeService.getByAddress(address);
	
	return ResponseEntity.ok().body(employee);
		
	}
	
	@PutMapping("/update")   //http://localhost:8085/employee/update
	public ResponseEntity<Employee> saveEmployee1(@RequestBody Employee employee){
		
	Employee emp=employeeService.saveEmployee(employee);
	
	return ResponseEntity.ok().body(emp);
		}
	

}
