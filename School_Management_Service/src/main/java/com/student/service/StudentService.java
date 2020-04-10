package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(long sid);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(Student student);
	
	public void deleteStudentById(long sid);
	
	public long countStudent();
	
	public boolean isPresentOrNot(long sid);
	
}