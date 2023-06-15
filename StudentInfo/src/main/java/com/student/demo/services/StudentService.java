package com.student.demo.services;

import com.student.demo.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudentId(Integer id);
	public Student updateStudent(Student student);
	public void deleteStudentById(Integer id);

}
