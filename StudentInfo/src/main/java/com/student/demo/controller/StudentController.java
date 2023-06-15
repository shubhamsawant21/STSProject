package com.student.demo.controller;

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

import com.student.demo.model.Student;
import com.student.demo.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")    //http://localhost:8080/student/save
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student std = studentService.saveStudent(student);
		
		return ResponseEntity.ok().body(std);
		
		}
	
	@PutMapping("/save")     //http://localhost:8080/student/save
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		
		Student std = studentService.updateStudent(student);
		return ResponseEntity.ok().body(std);
		
	}
	
	@GetMapping("/get/{id}")     //http://localhost:8080/student/get/
	public ResponseEntity<Student> getStudentbyId( @PathVariable("id")Integer id){
		
		Student std = studentService.getStudentId(id);
		
		return ResponseEntity.ok().body(std);
		
		}
	
	@DeleteMapping("/delete/{id}")    //http://localhost:8080/student/delete/
	public void deleteStudentById(@PathVariable("id")Integer id) throws Exception {
		
		studentService.deleteStudentById(id);
		
		
	}
	
	

}
