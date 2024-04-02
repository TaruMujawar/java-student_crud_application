package com.aloofly.studentcrudapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aloofly.studentcrudapi.model.Student;

@Service
public interface IStudentService {
	
	List<Student> getAllStudent();
	
	void deleteStudentById(int id);
	
	Student createStudent(Student student);

}
