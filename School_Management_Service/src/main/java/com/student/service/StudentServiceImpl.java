package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository;
import com.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(long sid) {
		return studentRepo.findById(sid).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepo.delete(student);
	}
	
	@Override
	public void deleteStudentById(long sid) {
		studentRepo.deleteById(sid);	
	}
	
	@Override
	public long countStudent() {
		return studentRepo.count();
	}
	
	@Override
	public boolean isPresentOrNot(long sid) {
		return studentRepo.existsById(sid);
	}
	
}//class
