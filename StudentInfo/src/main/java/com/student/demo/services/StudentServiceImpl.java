package com.student.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dao.StudentRepository;
import com.student.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{


	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
		
	}

	@Override
	public Student getStudentId(Integer id) {
	
		  Student student=studentRepository.findById(id).get();
		  return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
